.class public final enum Lio/branch/referral/Defines$LinkParam;
.super Ljava/lang/Enum;
.source "Defines.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Defines;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LinkParam"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/Defines$LinkParam;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/Defines$LinkParam;

.field public static final enum Alias:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Campaign:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Channel:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Data:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Duration:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Feature:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Stage:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Tags:Lio/branch/referral/Defines$LinkParam;

.field public static final enum Type:Lio/branch/referral/Defines$LinkParam;

.field public static final enum URL:Lio/branch/referral/Defines$LinkParam;


# instance fields
.field private key:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 253
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Tags"

    const-string/jumbo v2, "tags"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    .line 254
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Alias"

    const-string v2, "alias"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Alias:Lio/branch/referral/Defines$LinkParam;

    .line 255
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Type"

    const-string/jumbo v2, "type"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Type:Lio/branch/referral/Defines$LinkParam;

    .line 256
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Duration"

    const-string v2, "duration"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Duration:Lio/branch/referral/Defines$LinkParam;

    .line 257
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Channel"

    const-string v2, "channel"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Channel:Lio/branch/referral/Defines$LinkParam;

    .line 258
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Feature"

    const-string v2, "feature"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Feature:Lio/branch/referral/Defines$LinkParam;

    .line 259
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Stage"

    const-string/jumbo v2, "stage"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Stage:Lio/branch/referral/Defines$LinkParam;

    .line 260
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Campaign"

    const-string v2, "campaign"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Campaign:Lio/branch/referral/Defines$LinkParam;

    .line 261
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "Data"

    const-string v2, "data"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->Data:Lio/branch/referral/Defines$LinkParam;

    .line 262
    new-instance v0, Lio/branch/referral/Defines$LinkParam;

    const-string v1, "URL"

    const-string/jumbo v2, "url"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lio/branch/referral/Defines$LinkParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->URL:Lio/branch/referral/Defines$LinkParam;

    const/16 v0, 0xa

    .line 252
    new-array v0, v0, [Lio/branch/referral/Defines$LinkParam;

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v3

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Alias:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v4

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Type:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v5

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Duration:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v6

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Channel:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v7

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Feature:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v8

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Stage:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v9

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Campaign:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v10

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Data:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v11

    sget-object v1, Lio/branch/referral/Defines$LinkParam;->URL:Lio/branch/referral/Defines$LinkParam;

    aput-object v1, v0, v12

    sput-object v0, Lio/branch/referral/Defines$LinkParam;->$VALUES:[Lio/branch/referral/Defines$LinkParam;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 266
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const-string p1, ""

    .line 264
    iput-object p1, p0, Lio/branch/referral/Defines$LinkParam;->key:Ljava/lang/String;

    .line 267
    iput-object p3, p0, Lio/branch/referral/Defines$LinkParam;->key:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/Defines$LinkParam;
    .locals 1

    .line 252
    const-class v0, Lio/branch/referral/Defines$LinkParam;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/Defines$LinkParam;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/Defines$LinkParam;
    .locals 1

    .line 252
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->$VALUES:[Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, [Lio/branch/referral/Defines$LinkParam;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/Defines$LinkParam;

    return-object v0
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    .line 271
    iget-object v0, p0, Lio/branch/referral/Defines$LinkParam;->key:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Lio/branch/referral/Defines$LinkParam;->key:Ljava/lang/String;

    return-object v0
.end method
