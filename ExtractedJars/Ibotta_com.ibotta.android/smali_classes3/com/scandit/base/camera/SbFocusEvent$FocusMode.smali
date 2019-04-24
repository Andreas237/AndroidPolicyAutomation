.class public final enum Lcom/scandit/base/camera/SbFocusEvent$FocusMode;
.super Ljava/lang/Enum;
.source "SbFocusEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/SbFocusEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FocusMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/scandit/base/camera/SbFocusEvent$FocusMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum AUTO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum CONTINUOUS:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum FIXED_DISTANCE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum INFINITY:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum MACRO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public static final enum OFF:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 16
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "INFINITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->INFINITY:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 17
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "MACRO"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->MACRO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 18
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "AUTO"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->AUTO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 19
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "FIXED_DISTANCE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->FIXED_DISTANCE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 20
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "CONTINUOUS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->CONTINUOUS:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 21
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "OFF"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->OFF:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 23
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const-string v1, "IGNORE"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const/4 v0, 0x7

    .line 14
    new-array v0, v0, [Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->INFINITY:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->MACRO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->AUTO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->FIXED_DISTANCE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->CONTINUOUS:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->OFF:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    aput-object v1, v0, v8

    sput-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->$VALUES:[Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scandit/base/camera/SbFocusEvent$FocusMode;
    .locals 1

    .line 14
    const-class v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    return-object p0
.end method

.method public static values()[Lcom/scandit/base/camera/SbFocusEvent$FocusMode;
    .locals 1

    .line 14
    sget-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->$VALUES:[Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    invoke-virtual {v0}, [Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    return-object v0
.end method
