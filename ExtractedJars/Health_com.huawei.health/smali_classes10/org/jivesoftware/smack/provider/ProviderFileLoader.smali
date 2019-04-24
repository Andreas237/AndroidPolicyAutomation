.class public Lorg/jivesoftware/smack/provider/ProviderFileLoader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/provider/ProviderLoader;


# static fields
.field private static final TAG:Ljava/lang/String; = "ProviderFileLoader"


# instance fields
.field private exceptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Exception;>;"
        }
    .end annotation
.end field

.field private final extProviders:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;>;"
        }
    .end annotation
.end field

.field private final iqProviders:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lorg/jivesoftware/smack/provider/IQProviderInfo;>;"
        }
    .end annotation
.end field

.field private final sfProviders:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/lang/ClassLoader;)V
    .locals 16

    .line 50
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->iqProviders:Ljava/util/Collection;

    .line 42
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->extProviders:Ljava/util/Collection;

    .line 43
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->sfProviders:Ljava/util/Collection;

    .line 45
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    .line 53
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v4

    .line 54
    const-string v0, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v1, 0x1

    invoke-interface {v4, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 55
    const-string v0, "UTF-8"

    move-object/from16 v1, p1

    invoke-interface {v4, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 56
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    .line 58
    :cond_0
    const/4 v0, 0x2

    if-ne v5, v0, :cond_5

    .line 59
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 62
    const-string v0, "smackProviders"

    :try_start_1
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 63
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 64
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 65
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v7

    .line 66
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 67
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 68
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v8

    .line 69
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 70
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 71
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v9

    .line 74
    move-object/from16 v0, p2

    :try_start_2
    invoke-virtual {v0, v9}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    .line 75
    move-object v11, v6

    const/4 v12, -0x1

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "iqProvider"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v12, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "extensionProvider"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v12, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "streamFeatureProvider"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v12, 0x2

    :cond_1
    :goto_0
    packed-switch v12, :pswitch_data_0

    goto/16 :goto_1

    .line 82
    :pswitch_0
    const-class v0, Lorg/jivesoftware/smack/provider/IQProvider;

    invoke-virtual {v0, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {v10, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lorg/jivesoftware/smack/provider/IQProvider;

    .line 84
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->iqProviders:Ljava/util/Collection;

    new-instance v1, Lorg/jivesoftware/smack/provider/IQProviderInfo;

    invoke-direct {v1, v7, v8, v13}, Lorg/jivesoftware/smack/provider/IQProviderInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/IQProvider;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    goto/16 :goto_2

    .line 87
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not a IQProvider"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    goto/16 :goto_2

    .line 96
    :pswitch_1
    const-class v0, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    invoke-virtual {v0, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {v10, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    .line 98
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->extProviders:Ljava/util/Collection;

    new-instance v1, Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;

    invoke-direct {v1, v7, v8, v13}, Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    goto :goto_2

    .line 102
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not a PacketExtensionProvider"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    goto :goto_2

    .line 107
    :pswitch_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {v10, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->sfProviders:Ljava/util/Collection;

    new-instance v1, Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;

    invoke-direct {v1, v7, v8, v13}, Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    goto :goto_2

    .line 113
    :goto_1
    const-string v0, "ProviderFileLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown provider type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    :goto_2
    goto :goto_3

    .line 116
    :catch_0
    move-exception v10

    .line 117
    const-string v0, "ProviderFileLoader"

    const-string v1, "Could not find provider class"

    :try_start_3
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    goto :goto_3

    .line 120
    :catch_1
    move-exception v10

    .line 121
    const-string v0, "ProviderFileLoader"

    const-string v1, "Could not instanciate className "

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    :cond_4
    :goto_3
    goto :goto_4

    .line 126
    :catch_2
    move-exception v7

    .line 127
    const-string v0, "ProviderFileLoader"

    const-string v1, "Invalid provider type found when expecting iqProvider or extensionProvider"

    :try_start_4
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    :cond_5
    :goto_4
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v5

    .line 133
    const/4 v0, 0x1

    if-ne v5, v0, :cond_0

    .line 141
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 146
    goto :goto_6

    .line 143
    :catch_3
    move-exception v4

    .line 144
    const-string v0, "ProviderFileLoader"

    const-string v1, "providerStream can not close"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    goto :goto_6

    .line 135
    :catch_4
    move-exception v4

    .line 136
    const-string v0, "ProviderFileLoader"

    const-string v1, "Unknown error occurred while parsing provider file"

    :try_start_6
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 141
    :try_start_7
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 146
    goto :goto_6

    .line 143
    :catch_5
    move-exception v4

    .line 144
    const-string v0, "ProviderFileLoader"

    const-string v1, "providerStream can not close"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    goto :goto_6

    .line 140
    :catchall_0
    move-exception v14

    .line 141
    :try_start_8
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 146
    goto :goto_5

    .line 143
    :catch_6
    move-exception v15

    .line 144
    const-string v0, "ProviderFileLoader"

    const-string v1, "providerStream can not close"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    :goto_5
    throw v14

    .line 148
    :goto_6
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x2f8928b0 -> :sswitch_1
        0x4ce0767 -> :sswitch_2
        0x6d52cf39 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public getExtensionProviderInfo()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;>;"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->extProviders:Ljava/util/Collection;

    return-object v0
.end method

.method public getIQProviderInfo()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lorg/jivesoftware/smack/provider/IQProviderInfo;>;"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->iqProviders:Ljava/util/Collection;

    return-object v0
.end method

.method public getLoadingExceptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Exception;>;"
        }
    .end annotation

    .line 166
    iget-object v0, p0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->exceptions:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStreamFeatureProviderInfo()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Collection<Lorg/jivesoftware/smack/provider/StreamFeatureProviderInfo;>;"
        }
    .end annotation

    .line 162
    iget-object v0, p0, Lorg/jivesoftware/smack/provider/ProviderFileLoader;->sfProviders:Ljava/util/Collection;

    return-object v0
.end method
