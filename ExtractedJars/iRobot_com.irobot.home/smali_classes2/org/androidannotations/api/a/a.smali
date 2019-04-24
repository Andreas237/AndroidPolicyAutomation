.class public abstract Lorg/androidannotations/api/a/a;
.super Lorg/androidannotations/api/a/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Lorg/androidannotations/api/a/a<",
        "TI;>;>",
        "Lorg/androidannotations/api/a/d<",
        "TI;>;"
    }
.end annotation


# instance fields
.field protected a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lorg/androidannotations/api/a/d;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/androidannotations/api/a/e;
    .locals 2

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lorg/androidannotations/api/a/a;->a(I)Lorg/androidannotations/api/a/e;

    new-instance v0, Lorg/androidannotations/api/a/e;

    iget-object v1, p0, Lorg/androidannotations/api/a/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lorg/androidannotations/api/a/e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public abstract a(I)Lorg/androidannotations/api/a/e;
.end method
