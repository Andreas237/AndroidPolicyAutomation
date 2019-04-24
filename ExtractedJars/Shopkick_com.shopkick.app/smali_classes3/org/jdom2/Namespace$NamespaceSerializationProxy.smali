.class final Lorg/jdom2/Namespace$NamespaceSerializationProxy;
.super Ljava/lang/Object;
.source "Namespace.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/Namespace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NamespaceSerializationProxy"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final pprefix:Ljava/lang/String;

.field private final puri:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 363
    iput-object p1, p0, Lorg/jdom2/Namespace$NamespaceSerializationProxy;->pprefix:Ljava/lang/String;

    .line 364
    iput-object p2, p0, Lorg/jdom2/Namespace$NamespaceSerializationProxy;->puri:Ljava/lang/String;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2

    .line 368
    iget-object v0, p0, Lorg/jdom2/Namespace$NamespaceSerializationProxy;->pprefix:Ljava/lang/String;

    iget-object v1, p0, Lorg/jdom2/Namespace$NamespaceSerializationProxy;->puri:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object v0

    return-object v0
.end method
