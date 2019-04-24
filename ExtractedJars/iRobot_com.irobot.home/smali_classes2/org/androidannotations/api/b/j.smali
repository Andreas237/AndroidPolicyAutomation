.class public final Lorg/androidannotations/api/b/j;
.super Lorg/androidannotations/api/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lorg/androidannotations/api/b/e<",
        "TT;>;>",
        "Lorg/androidannotations/api/b/a<",
        "TT;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lorg/androidannotations/api/b/e;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lorg/androidannotations/api/b/a;-><init>(Lorg/androidannotations/api/b/e;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lorg/androidannotations/api/b/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/b/j;->a:Lorg/androidannotations/api/b/e;

    invoke-virtual {v0}, Lorg/androidannotations/api/b/e;->m()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lorg/androidannotations/api/b/j;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object p1, p0, Lorg/androidannotations/api/b/j;->a:Lorg/androidannotations/api/b/e;

    return-object p1
.end method
