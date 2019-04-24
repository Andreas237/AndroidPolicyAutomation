.class public final enum Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
.super Ljava/lang/Enum;
.source "Body.java"


# annotations
.annotation runtime Lcom/google/gson/annotations/JsonAdapter;
    value = Lcom/ibotta/tracking/generated/model/Body$PlatformEnum$Adapter;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/tracking/generated/model/Body;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PlatformEnum"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/tracking/generated/model/Body$PlatformEnum$Adapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

.field public static final enum ANDROID:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

.field public static final enum IOS:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

.field public static final enum WEB:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;


# instance fields
.field private value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 72
    new-instance v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    const-string v1, "IOS"

    const-string v2, "ios"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->IOS:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    .line 74
    new-instance v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    const-string v1, "ANDROID"

    const-string v2, "android"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->ANDROID:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    .line 76
    new-instance v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    const-string v1, "WEB"

    const-string v2, "web"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->WEB:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    const/4 v0, 0x3

    .line 70
    new-array v0, v0, [Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    sget-object v1, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->IOS:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->ANDROID:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->WEB:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->$VALUES:[Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

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

    .line 80
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 81
    iput-object p3, p0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->value:Ljava/lang/String;

    return-void
.end method

.method public static fromValue(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    .locals 5

    .line 94
    invoke-static {}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->values()[Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 95
    iget-object v4, v3, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->value:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 99
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected value \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    .locals 1

    .line 70
    const-class v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    .locals 1

    .line 70
    sget-object v0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->$VALUES:[Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    invoke-virtual {v0}, [Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->value:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->value:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
