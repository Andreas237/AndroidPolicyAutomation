.class public abstract Lorg/androidannotations/api/b/i;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/androidannotations/api/b/i;->a:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Z)Lorg/androidannotations/api/b/d;
    .locals 2

    new-instance v0, Lorg/androidannotations/api/b/d;

    iget-object v1, p0, Lorg/androidannotations/api/b/i;->a:Landroid/content/SharedPreferences;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Lorg/androidannotations/api/b/d;-><init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method protected a(Ljava/lang/String;I)Lorg/androidannotations/api/b/g;
    .locals 2

    new-instance v0, Lorg/androidannotations/api/b/g;

    iget-object v1, p0, Lorg/androidannotations/api/b/i;->a:Landroid/content/SharedPreferences;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v0, v1, p1, p2}, Lorg/androidannotations/api/b/g;-><init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final m()Landroid/content/SharedPreferences;
    .locals 1

    iget-object v0, p0, Lorg/androidannotations/api/b/i;->a:Landroid/content/SharedPreferences;

    return-object v0
.end method
