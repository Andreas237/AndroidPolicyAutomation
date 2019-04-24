.class public abstract Lorg/androidannotations/api/b/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lorg/androidannotations/api/b/e<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Lorg/androidannotations/api/b/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/androidannotations/api/b/e;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/androidannotations/api/b/a;->a:Lorg/androidannotations/api/b/e;

    iput-object p2, p0, Lorg/androidannotations/api/b/a;->b:Ljava/lang/String;

    return-void
.end method
