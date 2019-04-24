.class public abstract Lorg/androidannotations/api/b/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected final b:Landroid/content/SharedPreferences;

.field protected final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences;",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/androidannotations/api/b/b;->b:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lorg/androidannotations/api/b/b;->c:Ljava/lang/String;

    iput-object p3, p0, Lorg/androidannotations/api/b/b;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lorg/androidannotations/api/b/b;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/androidannotations/api/b/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract a(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation
.end method

.method protected final a(Landroid/content/SharedPreferences$Editor;)V
    .locals 0

    invoke-static {p1}, Lorg/androidannotations/api/b/h;->a(Landroid/content/SharedPreferences$Editor;)V

    return-void
.end method

.method protected b()Landroid/content/SharedPreferences$Editor;
    .locals 1

    iget-object v0, p0, Lorg/androidannotations/api/b/b;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lorg/androidannotations/api/b/b;->a:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Lorg/androidannotations/api/b/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method protected abstract c(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
