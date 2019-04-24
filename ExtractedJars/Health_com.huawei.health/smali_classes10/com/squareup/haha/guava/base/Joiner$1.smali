.class final Lcom/squareup/haha/guava/base/Joiner$1;
.super Lcom/squareup/haha/guava/base/Joiner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/guava/base/Joiner;->useForNull(Ljava/lang/String;)Lcom/squareup/haha/guava/base/Joiner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic this$0:Lcom/squareup/haha/guava/base/Joiner;

.field private synthetic val$nullText:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/base/Joiner;Lcom/squareup/haha/guava/base/Joiner;Ljava/lang/String;)V
    .locals 1

    .line 219
    iput-object p1, p0, Lcom/squareup/haha/guava/base/Joiner$1;->this$0:Lcom/squareup/haha/guava/base/Joiner;

    iput-object p3, p0, Lcom/squareup/haha/guava/base/Joiner$1;->val$nullText:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/squareup/haha/guava/base/Joiner;-><init>(Lcom/squareup/haha/guava/base/Joiner;B)V

    return-void
.end method


# virtual methods
.method final toString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 221
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/squareup/haha/guava/base/Joiner$1;->val$nullText:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/squareup/haha/guava/base/Joiner$1;->this$0:Lcom/squareup/haha/guava/base/Joiner;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/guava/base/Joiner;->toString(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final useForNull(Ljava/lang/String;)Lcom/squareup/haha/guava/base/Joiner;
    .locals 2

    .line 225
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "already specified useForNull"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
