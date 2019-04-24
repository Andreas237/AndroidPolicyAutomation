.class public abstract Lorg/c/c/a/a/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "a"


# instance fields
.field private b:Lorg/c/c/a/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    new-instance v0, Lorg/c/c/a/p;

    invoke-direct {v0}, Lorg/c/c/a/p;-><init>()V

    :goto_0
    iput-object v0, p0, Lorg/c/c/a/a/a;->b:Lorg/c/c/a/g;

    return-void

    :cond_0
    new-instance v0, Lorg/c/c/a/k;

    invoke-direct {v0}, Lorg/c/c/a/k;-><init>()V

    goto :goto_0

    return-void
.end method


# virtual methods
.method protected a(Ljava/net/URI;Lorg/c/c/f;)Lorg/c/c/a/e;
    .locals 4

    invoke-virtual {p0}, Lorg/c/c/a/a/a;->a()Lorg/c/c/a/g;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lorg/c/c/a/g;->createRequest(Ljava/net/URI;Lorg/c/c/f;)Lorg/c/c/a/e;

    move-result-object v0

    sget-object v1, Lorg/c/c/a/a/a;->a:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lorg/c/c/a/a/a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Created "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/c/c/f;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " request for \""

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v0
.end method

.method public a()Lorg/c/c/a/g;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/a/a;->b:Lorg/c/c/a/g;

    return-object v0
.end method

.method public a(Lorg/c/c/a/g;)V
    .locals 1

    const-string v0, "\'requestFactory\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/c/c/a/a/a;->b:Lorg/c/c/a/g;

    return-void
.end method
