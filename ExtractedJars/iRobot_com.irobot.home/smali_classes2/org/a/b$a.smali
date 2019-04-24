.class public final Lorg/a/b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lorg/a/b;
    .locals 0

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lorg/a/b;
    .locals 0

    return-object p0
.end method

.method public a(Lorg/a/d;)Lorg/a/b;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
