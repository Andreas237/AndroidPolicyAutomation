.class final enum Lcom/google/c/a/j$b$4;
.super Lcom/google/c/a/j$b;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 317
    invoke-direct {p0, p1, p2, v0}, Lcom/google/c/a/j$b;-><init>(Ljava/lang/String;ILcom/google/c/a/j$1;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Predicates.notNull()"

    return-object v0
.end method
