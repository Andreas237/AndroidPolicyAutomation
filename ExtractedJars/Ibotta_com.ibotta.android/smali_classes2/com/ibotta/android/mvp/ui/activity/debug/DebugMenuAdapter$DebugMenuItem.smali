.class public final enum Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;
.super Ljava/lang/Enum;
.source "DebugMenuAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DebugMenuItem"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_FEATURE_FLAGS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_GENERAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_IMAGE_TRANSPARENCY:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_LOADING:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_PERMISSION_PRIMERS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_PWI_CLEAR_ONBOARDING_FLAG:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum DEBUG_SPOTLIGHT_OFFER_TITLE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum FIND_ENGAGEMENTS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum TEST_GEOFENCE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum TEST_ROUTES:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

.field public static final enum TEST_SEMI_MODAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;


# instance fields
.field private final iconId:I

.field private final nameId:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_GENERAL"

    const/4 v2, 0x0

    const v3, 0x7f0800e8

    const v4, 0x7f110409

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_GENERAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_LOADING"

    const/4 v4, 0x1

    const v5, 0x7f11040b

    invoke-direct {v0, v1, v4, v3, v5}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_LOADING:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 33
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "TEST_ROUTES"

    const/4 v5, 0x2

    const v6, 0x7f11040e

    invoke-direct {v0, v1, v5, v3, v6}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_ROUTES:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 34
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "TEST_GEOFENCE"

    const/4 v6, 0x3

    const v7, 0x7f110417

    invoke-direct {v0, v1, v6, v3, v7}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_GEOFENCE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 35
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "FIND_ENGAGEMENTS"

    const/4 v7, 0x4

    const v8, 0x7f110410

    invoke-direct {v0, v1, v7, v3, v8}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->FIND_ENGAGEMENTS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "TEST_SEMI_MODAL"

    const/4 v8, 0x5

    const v9, 0x7f110419

    invoke-direct {v0, v1, v8, v3, v9}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_SEMI_MODAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_FEATURE_FLAGS"

    const/4 v9, 0x6

    const v10, 0x7f110408

    invoke-direct {v0, v1, v9, v3, v10}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_FEATURE_FLAGS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_IMAGE_TRANSPARENCY"

    const/4 v10, 0x7

    const v11, 0x7f11040a

    invoke-direct {v0, v1, v10, v3, v11}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_IMAGE_TRANSPARENCY:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 39
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_SPOTLIGHT_OFFER_TITLE"

    const/16 v11, 0x8

    const v12, 0x7f11040f

    invoke-direct {v0, v1, v11, v3, v12}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_SPOTLIGHT_OFFER_TITLE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_PWI_CLEAR_ONBOARDING_FLAG"

    const/16 v12, 0x9

    const v13, 0x7f11040d

    invoke-direct {v0, v1, v12, v3, v13}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_PWI_CLEAR_ONBOARDING_FLAG:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    .line 41
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const-string v1, "DEBUG_PERMISSION_PRIMERS"

    const/16 v13, 0xa

    const v14, 0x7f11040c

    invoke-direct {v0, v1, v13, v3, v14}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_PERMISSION_PRIMERS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    const/16 v0, 0xb

    .line 30
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_GENERAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_LOADING:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_ROUTES:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_GEOFENCE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->FIND_ENGAGEMENTS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_SEMI_MODAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_FEATURE_FLAGS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_IMAGE_TRANSPARENCY:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_SPOTLIGHT_OFFER_TITLE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_PWI_CLEAR_ONBOARDING_FLAG:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_PERMISSION_PRIMERS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    aput-object v1, v0, v13

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->iconId:I

    .line 47
    iput p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->nameId:I

    return-void
.end method

.method public static asList()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->values()[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 63
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;
    .locals 1

    .line 30
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;
    .locals 1

    .line 30
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    return-object v0
.end method


# virtual methods
.method public getIconId()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->iconId:I

    return v0
.end method

.method public getNameId()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->nameId:I

    return v0
.end method
