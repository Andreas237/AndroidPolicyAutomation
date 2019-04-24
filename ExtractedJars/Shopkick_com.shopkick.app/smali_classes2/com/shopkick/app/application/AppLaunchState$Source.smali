.class public final enum Lcom/shopkick/app/application/AppLaunchState$Source;
.super Ljava/lang/Enum;
.source "AppLaunchState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/AppLaunchState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Source"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/application/AppLaunchState$Source;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum DEEP_LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum LOCAL_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum PHONE_VERIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

.field public static final enum WEB_REG:Lcom/shopkick/app/application/AppLaunchState$Source;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 24
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 25
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "PHONE_VERIFICATION"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->PHONE_VERIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 26
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "WEB_REG"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->WEB_REG:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 27
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "PUSH_NOTIFICATION"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 28
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "LOCAL_NOTIFICATION"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->LOCAL_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 29
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "LINK"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    .line 30
    new-instance v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    const-string v1, "DEEP_LINK"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/shopkick/app/application/AppLaunchState$Source;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->DEEP_LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    const/4 v0, 0x7

    .line 23
    new-array v0, v0, [Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->DEFAULT:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->PHONE_VERIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->WEB_REG:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->LOCAL_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->DEEP_LINK:Lcom/shopkick/app/application/AppLaunchState$Source;

    aput-object v1, v0, v8

    sput-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->$VALUES:[Lcom/shopkick/app/application/AppLaunchState$Source;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/application/AppLaunchState$Source;
    .locals 1

    .line 23
    const-class v0, Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/application/AppLaunchState$Source;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/application/AppLaunchState$Source;
    .locals 1

    .line 23
    sget-object v0, Lcom/shopkick/app/application/AppLaunchState$Source;->$VALUES:[Lcom/shopkick/app/application/AppLaunchState$Source;

    invoke-virtual {v0}, [Lcom/shopkick/app/application/AppLaunchState$Source;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/application/AppLaunchState$Source;

    return-object v0
.end method
