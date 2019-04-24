.class public Lcom/usebutton/sdk/internal/models/Configuration;
.super Ljava/lang/Object;
.source "Configuration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/models/Configuration$Copy;,
        Lcom/usebutton/sdk/internal/models/Configuration$Parameters;
    }
.end annotation


# static fields
.field static final KEY_COPY:Ljava/lang/String; = "copy"

.field static final KEY_FLAGS:Ljava/lang/String; = "flags"

.field static final KEY_LINKS_CONFIGURATION:Ljava/lang/String; = "links_configuration"

.field static final KEY_PARAMETERS:Ljava/lang/String; = "parameters"


# instance fields
.field private final mCopy:Lcom/usebutton/sdk/internal/models/Configuration$Copy;

.field private final mFlags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mJsonRepresentation:Lorg/json/JSONObject;

.field private final mLinksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

.field private final mParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mFlags:Ljava/util/List;

    const-string v0, "parameters"

    .line 39
    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/models/Configuration;->objectOrEmpty(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "links_configuration"

    .line 40
    invoke-static {p1, v1}, Lcom/usebutton/sdk/internal/models/Configuration;->objectOrEmpty(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 41
    new-instance v2, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-direct {v2, v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;-><init>(Lorg/json/JSONObject;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    .line 42
    new-instance v2, Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    invoke-direct {v2, v1}, Lcom/usebutton/sdk/internal/models/LinksConfiguration;-><init>(Lorg/json/JSONObject;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mLinksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    const-string v2, "copy"

    .line 43
    invoke-static {p1, v2}, Lcom/usebutton/sdk/internal/models/Configuration;->objectOrEmpty(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 44
    new-instance v3, Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    invoke-direct {v3, v2}, Lcom/usebutton/sdk/internal/models/Configuration$Copy;-><init>(Lorg/json/JSONObject;)V

    iput-object v3, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mCopy:Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    const-string v3, "flags"

    .line 45
    invoke-static {p1, v3}, Lcom/usebutton/sdk/internal/models/Configuration;->objectOrEmpty(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 47
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 48
    iget-object v4, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mFlags:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    .line 50
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "parameters"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v0, 0x2

    const-string v4, "copy"

    aput-object v4, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    const/4 v0, 0x4

    const-string v2, "flags"

    aput-object v2, v3, v0

    const/4 v0, 0x5

    aput-object p1, v3, v0

    const/4 p1, 0x6

    const-string v0, "links_configuration"

    aput-object v0, v3, p1

    const/4 p1, 0x7

    aput-object v1, v3, p1

    invoke-static {v3}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    return-void
.end method

.method public static emptyConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 4

    .line 72
    :try_start_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Configuration;

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "parameters"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "copy"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "flags"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "links_configuration"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    aput-object v3, v1, v2

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/models/Configuration;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 79
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Could not create default configuration, this should never happen."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static final objectOrEmpty(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    .line 59
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 118
    :cond_1
    check-cast p1, Lcom/usebutton/sdk/internal/models/Configuration;

    .line 120
    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    .line 121
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getCopy()Lcom/usebutton/sdk/internal/models/Configuration$Copy;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mCopy:Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/models/Configuration$Copy;-><init>(Lorg/json/JSONObject;)V

    :goto_0
    return-object v0
.end method

.method public getFlags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mFlags:Ljava/util/List;

    return-object v0
.end method

.method public getJsonRepresentation()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getJsonString()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLinks()Lcom/usebutton/sdk/internal/models/LinksConfiguration;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mLinksConfiguration:Lcom/usebutton/sdk/internal/models/LinksConfiguration;

    return-object v0
.end method

.method public getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;-><init>(Lorg/json/JSONObject;)V

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Configuration;->mJsonRepresentation:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
