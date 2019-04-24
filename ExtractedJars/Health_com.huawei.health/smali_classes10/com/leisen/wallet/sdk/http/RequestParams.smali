.class public Lcom/leisen/wallet/sdk/http/RequestParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;
    }
.end annotation


# static fields
.field public static final APPLICATION_OCTET_STREAM:Ljava/lang/String; = "application/octet-stream"

.field private static final TAG:Ljava/lang/String; = "RequestParams"


# instance fields
.field protected contentEncoding:Ljava/lang/String;

.field protected final fileParams:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;>;"
        }
    .end annotation
.end field

.field private isRepeatable:Z

.field protected final urlParams:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field protected final urlParamsWithObjects:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/http/RequestParams;-><init>(Ljava/util/Map;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParams:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParamsWithObjects:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->fileParams:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    const-string v0, "UTF-8"

    iput-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->contentEncoding:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->isRepeatable:Z

    .line 45
    if-eqz p1, :cond_0

    .line 46
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 47
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/RequestParams;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method private createFormEntity()Lorg/apache/http/HttpEntity;
    .locals 4

    .line 195
    :try_start_0
    new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->contentEncoding:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 196
    :catch_0
    move-exception v3

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception e "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 199
    const/4 v0, 0x0

    return-object v0
.end method

.method private getParamsList(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List<Lorg/apache/http/message/BasicNameValuePair;>;"
        }
    .end annotation

    .line 101
    const-string v0, "RequestParams"

    const-string v1, "enter getParamsList two params"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 103
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_3

    .line 104
    const-string v0, "RequestParams"

    const-string v1, "value is Map"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    move-object v5, p2

    check-cast v5, Ljava/util/Map;

    .line 106
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    invoke-static {v6}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 109
    const-string v0, "RequestParams"

    const-string v1, "next again Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 111
    const-string v0, "RequestParams"

    const-string v1, "enter getParamsList two params Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    instance-of v0, v8, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 113
    const-string v0, "RequestParams"

    const-string v1, "judge nestedKey is key"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 115
    if-eqz v9, :cond_1

    .line 116
    const-string v0, "RequestParams"

    const-string v1, "judge nestedValue"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    if-nez p1, :cond_0

    move-object v0, v8

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const-string v0, "%s[%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p0, v0, v9}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 120
    :cond_1
    goto :goto_0

    .line 121
    :cond_2
    goto/16 :goto_5

    :cond_3
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_5

    .line 122
    const-string v0, "RequestParams"

    const-string v1, "enter getParamsList two params Loop value is List"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 124
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 125
    const-string v0, "RequestParams"

    const-string v1, "next again Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_4

    .line 127
    const-string v0, "%s[%d]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 126
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 129
    :cond_4
    goto/16 :goto_5

    :cond_5
    instance-of v0, p2, [Ljava/lang/Object;

    if-eqz v0, :cond_7

    .line 130
    const-string v0, "RequestParams"

    const-string v1, "enter getParamsList two params Loop value is Object"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    move-object v0, p2

    check-cast v0, [Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, [Ljava/lang/Object;

    .line 132
    array-length v6, v5

    .line 133
    const-string v0, "RequestParams"

    const-string v1, "next again Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_6

    .line 135
    const-string v0, "%s[%d]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    aget-object v1, v5, v7

    invoke-direct {p0, v0, v1}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 137
    :cond_6
    goto :goto_5

    :cond_7
    instance-of v0, p2, Ljava/util/Set;

    if-eqz v0, :cond_9

    .line 138
    const-string v0, "RequestParams"

    const-string v1, "enter getParamsList two params Loop value is Set"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    move-object v5, p2

    check-cast v5, Ljava/util/Set;

    .line 140
    const-string v0, "RequestParams"

    const-string v1, "next again Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 142
    invoke-direct {p0, p1, v7}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 143
    goto :goto_4

    .line 144
    :cond_8
    goto :goto_5

    .line 145
    :cond_9
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    :goto_5
    const-string v0, "RequestParams"

    const-string v1, "exit getParamsList two params"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    return-object v4
.end method

.method private put(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 54
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 55
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParams:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_0
    return-void
.end method


# virtual methods
.method public getEntity(Lcom/leisen/wallet/sdk/http/ResponseHandlerInterface;)Lorg/apache/http/HttpEntity;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 162
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/RequestParams;->createFormEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    return-object v0
.end method

.method protected getParamString()Ljava/lang/String;
    .locals 2

    .line 157
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->contentEncoding:Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getParamsList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/apache/http/message/BasicNameValuePair;>;"
        }
    .end annotation

    .line 89
    const-string v0, "RequestParams"

    const-string v1, "enter getParamsList zero params"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 91
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParams:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 92
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    const-string v0, "RequestParams"

    const-string v1, "enter milder Loop finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParamsWithObjects:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/http/RequestParams;->getParamsList(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 96
    const-string v0, "RequestParams"

    const-string v1, "exit getParamsList zero params"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    return-object v3
.end method

.method public put(Ljava/lang/String;I)V
    .locals 2

    .line 77
    if-eqz p1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParams:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_0
    return-void
.end method

.method public put(Ljava/lang/String;J)V
    .locals 2

    .line 83
    if-eqz p1, :cond_0

    .line 84
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParams:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :cond_0
    return-void
.end method

.method public put(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 68
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V

    throw v0

    .line 71
    :cond_1
    if-eqz p1, :cond_2

    .line 72
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->fileParams:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;

    invoke-direct {v1, p2, p3}, Lcom/leisen/wallet/sdk/http/RequestParams$FileWrapper;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_2
    return-void
.end method

.method public put(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 61
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 62
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->urlParamsWithObjects:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :cond_0
    return-void
.end method

.method public setHttpEntityIsRepeatable(Z)V
    .locals 0

    .line 203
    iput-boolean p1, p0, Lcom/leisen/wallet/sdk/http/RequestParams;->isRepeatable:Z

    .line 204
    return-void
.end method
