package com.fzs.hzy.baselibrary.glide;

import com.bumptech.glide.request.RequestOptions;

public class GlideOptions extends RequestOptions {
    /**
     * @see CustomGlideExtension#miniThumb(RequestOptions)
     */
    public GlideOptions miniThumb() {
        CustomGlideExtension.miniThumb(this);
        return this;
    }



    /**
     * @see CustomGlideExtension#miniThumb(RequestOptions)
     */
    public static GlideOptions miniThumbOf() {
        return new GlideOptions().miniThumb();
    }
}