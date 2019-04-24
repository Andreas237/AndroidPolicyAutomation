.class public abstract Lorg/androidannotations/api/b/e;
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
.field private final a:Landroid/content/SharedPreferences$Editor;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iput-object p1, p0, Lorg/androidannotations/api/b/e;->a:Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method private a()Lorg/androidannotations/api/b/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Lorg/androidannotations/api/b/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/androidannotations/api/b/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lorg/androidannotations/api/b/f;

    invoke-direct {p0}, Lorg/androidannotations/api/b/e;->a()Lorg/androidannotations/api/b/e;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/androidannotations/api/b/f;-><init>(Lorg/androidannotations/api/b/e;Ljava/lang/String;)V

    return-object v0
.end method

.method protected b(Ljava/lang/String;)Lorg/androidannotations/api/b/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/androidannotations/api/b/j<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lorg/androidannotations/api/b/j;

    invoke-direct {p0}, Lorg/androidannotations/api/b/e;->a()Lorg/androidannotations/api/b/e;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/androidannotations/api/b/j;-><init>(Lorg/androidannotations/api/b/e;Ljava/lang/String;)V

    return-object v0
.end method

.method protected c(Ljava/lang/String;)Lorg/androidannotations/api/b/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/androidannotations/api/b/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lorg/androidannotations/api/b/c;

    invoke-direct {p0}, Lorg/androidannotations/api/b/e;->a()Lorg/androidannotations/api/b/e;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lorg/androidannotations/api/b/c;-><init>(Lorg/androidannotations/api/b/e;Ljava/lang/String;)V

    return-object v0
.end method

.method protected m()Landroid/content/SharedPreferences$Editor;
    .locals 1

    iget-object v0, p0, Lorg/androidannotations/api/b/e;->a:Landroid/content/SharedPreferences$Editor;

    return-object v0
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lorg/androidannotations/api/b/e;->a:Landroid/content/SharedPreferences$Editor;

    invoke-static {v0}, Lorg/androidannotations/api/b/h;->a(Landroid/content/SharedPreferences$Editor;)V

    return-void
.end method
