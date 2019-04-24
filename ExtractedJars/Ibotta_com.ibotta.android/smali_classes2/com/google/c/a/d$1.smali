.class Lcom/google/c/a/d$1;
.super Lcom/google/c/a/d;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/a/d;->b(Ljava/lang/String;)Lcom/google/c/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/c/a/d;


# direct methods
.method constructor <init>(Lcom/google/c/a/d;Lcom/google/c/a/d;Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/google/c/a/d$1;->b:Lcom/google/c/a/d;

    iput-object p3, p0, Lcom/google/c/a/d$1;->a:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Lcom/google/c/a/d;-><init>(Lcom/google/c/a/d;Lcom/google/c/a/d$1;)V

    return-void
.end method


# virtual methods
.method a(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    if-nez p1, :cond_0

    .line 225
    iget-object p1, p0, Lcom/google/c/a/d$1;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/c/a/d$1;->b:Lcom/google/c/a/d;

    invoke-virtual {v0, p1}, Lcom/google/c/a/d;->a(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(Ljava/lang/String;)Lcom/google/c/a/d;
    .locals 1

    .line 230
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "already specified useForNull"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
