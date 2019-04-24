.class public final Lorg/jivesoftware/smack/SmackInitialization;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final SMACK_VERSION:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "SmackInitialization"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 55
    const-string v0, "4.2.0"

    sput-object v0, Lorg/jivesoftware/smack/SmackInitialization;->SMACK_VERSION:Ljava/lang/String;

    .line 58
    new-instance v0, Lorg/jivesoftware/smack/android/AndroidSmackInitializer;

    invoke-direct {v0}, Lorg/jivesoftware/smack/android/AndroidSmackInitializer;-><init>()V

    invoke-virtual {v0}, Lorg/jivesoftware/smack/android/AndroidSmackInitializer;->initialize()Ljava/util/List;

    .line 71
    new-instance v0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;

    invoke-direct {v0}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism;-><init>()V

    invoke-static {v0}, Lorg/jivesoftware/smack/SASLAuthentication;->registerSASLMechanism(Lorg/jivesoftware/smack/sasl/SASLMechanism;)V

    .line 73
    const-string v0, "bind"

    const-string v1, "urn:ietf:params:xml:ns:xmpp-bind"

    new-instance v2, Lorg/jivesoftware/smack/provider/BindIQProvider;

    invoke-direct {v2}, Lorg/jivesoftware/smack/provider/BindIQProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x1

    sput-boolean v0, Lorg/jivesoftware/smack/SmackConfiguration;->smackInitialized:Z

    .line 76
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static loadSmackClass(Ljava/lang/String;ZLjava/lang/ClassLoader;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 145
    const/4 v0, 0x1

    :try_start_0
    invoke-static {p0, v0, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 154
    goto :goto_0

    .line 147
    :catch_0
    move-exception v4

    .line 148
    const-string v0, "SmackInitialization"

    const-string v1, "A startup class could not be loaded."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    if-nez p1, :cond_0

    .line 150
    throw v4

    .line 152
    :cond_0
    return-void

    .line 155
    :goto_0
    const-class v0, Lorg/jivesoftware/smack/initializer/SmackInitializer;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 156
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/initializer/SmackInitializer;

    .line 157
    invoke-interface {v4}, Lorg/jivesoftware/smack/initializer/SmackInitializer;->initialize()Ljava/util/List;

    move-result-object v5

    .line 158
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 159
    :cond_1
    const-string v0, "SmackInitialization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Loaded SmackInitializer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 161
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Exception;

    .line 162
    const-string v0, "SmackInitialization"

    const-string v1, "Exception in loadSmackClass"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    goto :goto_1

    .line 165
    :cond_3
    :goto_2
    goto :goto_3

    .line 166
    :cond_4
    const-string v0, "SmackInitialization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Loaded "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    :goto_3
    return-void
.end method

.method private static parseClassesToLoad(Lorg/xmlpull/v1/XmlPullParser;ZLjava/util/Collection;Ljava/lang/ClassLoader;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/xmlpull/v1/XmlPullParser;ZLjava/util/Collection<Ljava/lang/Exception;>;Ljava/lang/ClassLoader;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Ljava/lang/Exception;
        }
    .end annotation

    .line 112
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    .line 116
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    .line 117
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 118
    const/4 v0, 0x2

    if-ne v2, v0, :cond_3

    const-string v0, "className"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 119
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-static {v4}, Lorg/jivesoftware/smack/SmackConfiguration;->isDisabledSmackClass(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    goto :goto_0

    .line 125
    :cond_1
    :try_start_0
    invoke-static {v4, p1, p3}, Lorg/jivesoftware/smack/SmackInitialization;->loadSmackClass(Ljava/lang/String;ZLjava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    goto :goto_0

    .line 126
    :catch_0
    move-exception v5

    .line 129
    if-eqz p2, :cond_2

    .line 130
    invoke-interface {p2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 132
    :cond_2
    throw v5

    .line 137
    :cond_3
    :goto_0
    const/4 v0, 0x3

    if-ne v2, v0, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    return-void
.end method

.method public static processConfigFile(Ljava/io/InputStream;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/InputStream;Ljava/util/Collection<Ljava/lang/Exception;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 80
    const-class v0, Lorg/jivesoftware/smack/SmackInitialization;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/jivesoftware/smack/SmackInitialization;->processConfigFile(Ljava/io/InputStream;Ljava/util/Collection;Ljava/lang/ClassLoader;)V

    .line 81
    return-void
.end method

.method public static processConfigFile(Ljava/io/InputStream;Ljava/util/Collection;Ljava/lang/ClassLoader;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/InputStream;Ljava/util/Collection<Ljava/lang/Exception;>;Ljava/lang/ClassLoader;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 85
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 86
    const-string v0, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 87
    const-string v0, "UTF-8"

    invoke-interface {v2, p0, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 88
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 90
    :cond_0
    const/4 v0, 0x2

    if-ne v3, v0, :cond_2

    .line 91
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "startupClasses"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    const/4 v0, 0x0

    invoke-static {v2, v0, p1, p2}, Lorg/jivesoftware/smack/SmackInitialization;->parseClassesToLoad(Lorg/xmlpull/v1/XmlPullParser;ZLjava/util/Collection;Ljava/lang/ClassLoader;)V

    goto :goto_0

    .line 94
    :cond_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "optionalStartupClasses"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    const/4 v0, 0x1

    invoke-static {v2, v0, p1, p2}, Lorg/jivesoftware/smack/SmackInitialization;->parseClassesToLoad(Lorg/xmlpull/v1/XmlPullParser;ZLjava/util/Collection;Ljava/lang/ClassLoader;)V

    .line 98
    :cond_2
    :goto_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 100
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 102
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_1

    .line 104
    :catch_0
    move-exception v4

    .line 105
    const-string v0, "SmackInitialization"

    const-string v1, "Error while closing config file input stream"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :goto_1
    return-void
.end method
