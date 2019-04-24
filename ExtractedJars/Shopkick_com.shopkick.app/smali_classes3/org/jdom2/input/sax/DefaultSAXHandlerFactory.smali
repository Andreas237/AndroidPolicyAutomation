.class public final Lorg/jdom2/input/sax/DefaultSAXHandlerFactory;
.super Ljava/lang/Object;
.source "DefaultSAXHandlerFactory.java"

# interfaces
.implements Lorg/jdom2/input/sax/SAXHandlerFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/input/sax/DefaultSAXHandlerFactory$DefaultSAXHandler;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createSAXHandler(Lorg/jdom2/JDOMFactory;)Lorg/jdom2/input/sax/SAXHandler;
    .locals 1

    .line 82
    new-instance v0, Lorg/jdom2/input/sax/DefaultSAXHandlerFactory$DefaultSAXHandler;

    invoke-direct {v0, p1}, Lorg/jdom2/input/sax/DefaultSAXHandlerFactory$DefaultSAXHandler;-><init>(Lorg/jdom2/JDOMFactory;)V

    return-object v0
.end method
