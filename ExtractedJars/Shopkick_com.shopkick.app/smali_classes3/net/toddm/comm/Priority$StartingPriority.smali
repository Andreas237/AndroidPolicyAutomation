.class public final enum Lnet/toddm/comm/Priority$StartingPriority;
.super Ljava/lang/Enum;
.source "Priority.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/Priority;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StartingPriority"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/toddm/comm/Priority$StartingPriority;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lnet/toddm/comm/Priority$StartingPriority;

.field public static final enum HIGH:Lnet/toddm/comm/Priority$StartingPriority;

.field public static final enum LOW:Lnet/toddm/comm/Priority$StartingPriority;

.field public static final enum MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;


# instance fields
.field private final _priority:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 24
    new-instance v0, Lnet/toddm/comm/Priority$StartingPriority;

    const-string v1, "LOW"

    const/4 v2, 0x0

    const/16 v3, 0xa

    .line 32
    invoke-direct {v0, v1, v2, v3}, Lnet/toddm/comm/Priority$StartingPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    .line 33
    new-instance v0, Lnet/toddm/comm/Priority$StartingPriority;

    const-string v1, "MEDIUM"

    const/4 v3, 0x1

    const/4 v4, 0x7

    .line 34
    invoke-direct {v0, v1, v3, v4}, Lnet/toddm/comm/Priority$StartingPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    .line 35
    new-instance v0, Lnet/toddm/comm/Priority$StartingPriority;

    const-string v1, "HIGH"

    const/4 v4, 0x3

    const/4 v5, 0x2

    .line 36
    invoke-direct {v0, v1, v5, v4}, Lnet/toddm/comm/Priority$StartingPriority;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    .line 22
    new-array v0, v4, [Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v1, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    aput-object v1, v0, v2

    sget-object v1, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    aput-object v1, v0, v3

    sget-object v1, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    aput-object v1, v0, v5

    sput-object v0, Lnet/toddm/comm/Priority$StartingPriority;->ENUM$VALUES:[Lnet/toddm/comm/Priority$StartingPriority;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lnet/toddm/comm/Priority$StartingPriority;->_priority:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/toddm/comm/Priority$StartingPriority;
    .locals 1

    .line 1
    const-class v0, Lnet/toddm/comm/Priority$StartingPriority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/toddm/comm/Priority$StartingPriority;

    return-object p0
.end method

.method public static values()[Lnet/toddm/comm/Priority$StartingPriority;
    .locals 4

    .line 1
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->ENUM$VALUES:[Lnet/toddm/comm/Priority$StartingPriority;

    array-length v1, v0

    new-array v2, v1, [Lnet/toddm/comm/Priority$StartingPriority;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method public getPriorityValue()I
    .locals 1

    .line 42
    iget v0, p0, Lnet/toddm/comm/Priority$StartingPriority;->_priority:I

    return v0
.end method
