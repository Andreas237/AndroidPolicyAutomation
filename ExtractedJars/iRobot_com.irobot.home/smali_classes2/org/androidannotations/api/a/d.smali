.class public abstract Lorg/androidannotations/api/a/d;
.super Lorg/androidannotations/api/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Lorg/androidannotations/api/a/d<",
        "TI;>;>",
        "Lorg/androidannotations/api/a/b;"
    }
.end annotation


# instance fields
.field protected final b:Landroid/content/Context;

.field protected final c:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Lorg/androidannotations/api/a/b;-><init>()V

    iput-object p1, p0, Lorg/androidannotations/api/a/d;->b:Landroid/content/Context;

    iput-object p2, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {p0, p1, v0}, Lorg/androidannotations/api/a/d;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Lorg/androidannotations/api/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)TI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public a(Ljava/lang/String;J)Lorg/androidannotations/api/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)TI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/io/Serializable;)Lorg/androidannotations/api/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/Serializable;",
            ")TI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method

.method public a(Ljava/lang/String;Z)Lorg/androidannotations/api/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)TI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public b()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    return-object v0
.end method

.method public g(I)Lorg/androidannotations/api/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/a/d;->c:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    return-object p0
.end method
