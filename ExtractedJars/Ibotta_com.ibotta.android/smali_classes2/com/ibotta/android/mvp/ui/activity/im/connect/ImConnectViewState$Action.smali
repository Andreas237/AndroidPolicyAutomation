.class public final enum Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
.super Ljava/lang/Enum;
.source "ImConnectViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field public static final enum CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field public static final enum DISABLED:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

.field public static final enum LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 43
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    const-string v1, "LOGIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 44
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    const-string v1, "CREATE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 45
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    const-string v1, "DISABLED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->DISABLED:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    const/4 v0, 0x3

    .line 42
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->DISABLED:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
    .locals 1

    .line 42
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
    .locals 1

    .line 42
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    return-object v0
.end method
