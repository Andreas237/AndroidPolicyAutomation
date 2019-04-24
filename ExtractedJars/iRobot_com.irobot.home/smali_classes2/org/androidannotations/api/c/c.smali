.class public Lorg/androidannotations/api/c/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Lorg/androidannotations/api/c/c;


# instance fields
.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lorg/androidannotations/api/c/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lorg/androidannotations/api/c/c;->b:Ljava/util/Set;

    return-void
.end method

.method public static a(Lorg/androidannotations/api/c/c;)Lorg/androidannotations/api/c/c;
    .locals 1

    sget-object v0, Lorg/androidannotations/api/c/c;->a:Lorg/androidannotations/api/c/c;

    sput-object p0, Lorg/androidannotations/api/c/c;->a:Lorg/androidannotations/api/c/c;

    return-object v0
.end method

.method public static a(Lorg/androidannotations/api/c/b;)V
    .locals 1

    sget-object v0, Lorg/androidannotations/api/c/c;->a:Lorg/androidannotations/api/c/c;

    if-eqz v0, :cond_0

    sget-object v0, Lorg/androidannotations/api/c/c;->a:Lorg/androidannotations/api/c/c;

    iget-object v0, v0, Lorg/androidannotations/api/c/c;->b:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lorg/androidannotations/api/c/a;)V
    .locals 2

    iget-object v0, p0, Lorg/androidannotations/api/c/c;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/androidannotations/api/c/b;

    invoke-interface {v1, p1}, Lorg/androidannotations/api/c/b;->a(Lorg/androidannotations/api/c/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method
