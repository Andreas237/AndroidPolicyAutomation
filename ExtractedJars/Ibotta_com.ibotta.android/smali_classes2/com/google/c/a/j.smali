.class public final Lcom/google/c/a/j;
.super Ljava/lang/Object;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/a/j$a;,
        Lcom/google/c/a/j$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/c/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2c

    .line 370
    invoke-static {v0}, Lcom/google/c/a/d;->a(C)Lcom/google/c/a/d;

    move-result-object v0

    sput-object v0, Lcom/google/c/a/j;->a:Lcom/google/c/a/d;

    return-void
.end method

.method public static a()Lcom/google/c/a/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/a/i<",
            "TT;>;"
        }
    .end annotation

    .line 71
    sget-object v0, Lcom/google/c/a/j$b;->c:Lcom/google/c/a/j$b;

    invoke-virtual {v0}, Lcom/google/c/a/j$b;->a()Lcom/google/c/a/i;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/c/a/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/google/c/a/i<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 162
    invoke-static {}, Lcom/google/c/a/j;->a()Lcom/google/c/a/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/c/a/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/c/a/j$a;-><init>(Ljava/lang/Object;Lcom/google/c/a/j$1;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
