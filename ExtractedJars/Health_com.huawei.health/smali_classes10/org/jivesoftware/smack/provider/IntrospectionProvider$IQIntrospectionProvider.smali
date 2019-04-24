.class public abstract Lorg/jivesoftware/smack/provider/IntrospectionProvider$IQIntrospectionProvider;
.super Lorg/jivesoftware/smack/provider/IQProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/provider/IntrospectionProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "IQIntrospectionProvider"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:Lorg/jivesoftware/smack/packet/IQ;>Lorg/jivesoftware/smack/provider/IQProvider<TI;>;"
    }
.end annotation


# instance fields
.field private final elementClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<TI;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<TI;>;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/IQProvider;-><init>()V

    .line 37
    iput-object p1, p0, Lorg/jivesoftware/smack/provider/IntrospectionProvider$IQIntrospectionProvider;->elementClass:Ljava/lang/Class;

    .line 38
    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 33
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/provider/IntrospectionProvider$IQIntrospectionProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/IQ;

    move-result-object v0

    return-object v0
.end method

.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/IQ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/xmlpull/v1/XmlPullParser;I)TI;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 45
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/provider/IntrospectionProvider$IQIntrospectionProvider;->elementClass:Ljava/lang/Class;

    invoke-static {v0, p1, p2}, Lorg/jivesoftware/smack/provider/IntrospectionProvider;->parseWithIntrospection(Ljava/lang/Class;Lorg/xmlpull/v1/XmlPullParser;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/IQ;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 47
    :catch_0
    move-exception v1

    .line 49
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
