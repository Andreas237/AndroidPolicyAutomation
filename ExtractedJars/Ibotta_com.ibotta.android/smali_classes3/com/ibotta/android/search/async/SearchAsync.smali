.class public interface abstract Lcom/ibotta/android/search/async/SearchAsync;
.super Ljava/lang/Object;
.source "SearchAsync.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/search/async/SearchAsync$SearchContent;
    }
.end annotation


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract isMisspelled(Lcom/ibotta/api/model/search/SearchType;)Z
.end method

.method public abstract search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/lang/Long;Ljava/util/Set;Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V
    .param p3    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/search/SearchType;",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/search/async/SearchAsync$SearchContent;",
            ">;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SearchResults;",
            ">;",
            "Ljava9/util/function/Consumer<",
            "Ljava/lang/Exception;",
            ">;)V"
        }
    .end annotation
.end method
