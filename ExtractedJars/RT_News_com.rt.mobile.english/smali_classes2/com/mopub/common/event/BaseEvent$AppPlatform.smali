.class public final enum Lcom/mopub/common/event/BaseEvent$AppPlatform;
.super Ljava/lang/Enum;
.source "BaseEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/BaseEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AppPlatform"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/event/BaseEvent$AppPlatform;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/event/BaseEvent$AppPlatform;

.field public static final enum ANDROID:Lcom/mopub/common/event/BaseEvent$AppPlatform;

.field public static final enum IOS:Lcom/mopub/common/event/BaseEvent$AppPlatform;

.field public static final enum MOBILE_WEB:Lcom/mopub/common/event/BaseEvent$AppPlatform;

.field public static final enum NONE:Lcom/mopub/common/event/BaseEvent$AppPlatform;


# instance fields
.field private final mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 47
    new-instance v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/mopub/common/event/BaseEvent$AppPlatform;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->NONE:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    .line 48
    new-instance v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;

    const-string v1, "IOS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/mopub/common/event/BaseEvent$AppPlatform;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->IOS:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    .line 49
    new-instance v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;

    const-string v1, "ANDROID"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lcom/mopub/common/event/BaseEvent$AppPlatform;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->ANDROID:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    .line 50
    new-instance v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;

    const-string v1, "MOBILE_WEB"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v5}, Lcom/mopub/common/event/BaseEvent$AppPlatform;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->MOBILE_WEB:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    const/4 v0, 0x4

    .line 46
    new-array v0, v0, [Lcom/mopub/common/event/BaseEvent$AppPlatform;

    sget-object v1, Lcom/mopub/common/event/BaseEvent$AppPlatform;->NONE:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/event/BaseEvent$AppPlatform;->IOS:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/event/BaseEvent$AppPlatform;->ANDROID:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/event/BaseEvent$AppPlatform;->MOBILE_WEB:Lcom/mopub/common/event/BaseEvent$AppPlatform;

    aput-object v1, v0, v5

    sput-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->$VALUES:[Lcom/mopub/common/event/BaseEvent$AppPlatform;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 53
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 54
    iput p3, p0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->mType:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$AppPlatform;
    .locals 1

    .line 46
    const-class v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/event/BaseEvent$AppPlatform;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/event/BaseEvent$AppPlatform;
    .locals 1

    .line 46
    sget-object v0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->$VALUES:[Lcom/mopub/common/event/BaseEvent$AppPlatform;

    invoke-virtual {v0}, [Lcom/mopub/common/event/BaseEvent$AppPlatform;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/event/BaseEvent$AppPlatform;

    return-object v0
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/mopub/common/event/BaseEvent$AppPlatform;->mType:I

    return v0
.end method
