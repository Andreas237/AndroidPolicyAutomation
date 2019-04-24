.class public interface abstract Lcom/ibotta/api/model/customer/ServerCategorySetting;
.super Ljava/lang/Object;
.source "ServerCategorySetting.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/ibotta/api/model/customer/ServerCategorySetting;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract copy()Lcom/ibotta/api/model/customer/ServerCategorySetting;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getCategoryId()I
.end method

.method public abstract getSortOrder()S
.end method

.method public abstract getViewState()Ljava/lang/String;
.end method

.method public abstract getViewStateEnum()Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
.end method

.method public abstract setCategoryId(I)V
.end method

.method public abstract setSortOrder(S)V
.end method

.method public abstract setViewState(Ljava/lang/String;)V
.end method

.method public abstract setViewStateEnum(Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;)V
.end method
