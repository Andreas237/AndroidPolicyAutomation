.class public abstract Lorg/androidannotations/api/a/c;
.super Lorg/androidannotations/api/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Lorg/androidannotations/api/a/c<",
        "TI;TF;>;F:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/androidannotations/api/a/b;"
    }
.end annotation


# instance fields
.field protected a:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/androidannotations/api/a/b;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lorg/androidannotations/api/a/c;->a:Landroid/os/Bundle;

    return-void
.end method
