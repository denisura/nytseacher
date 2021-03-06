package com.github.denisura.nytseacher.ui.search.results;

import android.support.v7.widget.RecyclerView;

import com.github.denisura.nytseacher.data.model.Article;
import com.github.denisura.nytseacher.databinding.CardviewArticleTextBinding;

class TextViewHolder extends RecyclerView.ViewHolder {

    private final CardviewArticleTextBinding mBinding;
    private final ArticleViewModel mViewModel;

    TextViewHolder(CardviewArticleTextBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
        mViewModel = new ArticleViewModel(binding.getRoot().getContext());
        mBinding.setViewModel(mViewModel);
    }

    public void bindArticle(Article article) {
        mBinding.headline.setText(article.getHeadline());
        mViewModel.setArticle(article);
        mBinding.executePendingBindings();
    }
}
