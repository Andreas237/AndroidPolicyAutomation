.class public final enum Lnet/toddm/comm/Work$Status;
.super Ljava/lang/Enum;
.source "Work.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/Work;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/toddm/comm/Work$Status;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CANCELLED:Lnet/toddm/comm/Work$Status;

.field public static final enum COMPLETED:Lnet/toddm/comm/Work$Status;

.field public static final enum CREATED:Lnet/toddm/comm/Work$Status;

.field private static final synthetic ENUM$VALUES:[Lnet/toddm/comm/Work$Status;

.field public static final enum REDIRECTING:Lnet/toddm/comm/Work$Status;

.field public static final enum RETRYING:Lnet/toddm/comm/Work$Status;

.field public static final enum RUNNING:Lnet/toddm/comm/Work$Status;

.field public static final enum WAITING:Lnet/toddm/comm/Work$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 31
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "CREATED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 32
    sput-object v0, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    .line 33
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "WAITING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 34
    sput-object v0, Lnet/toddm/comm/Work$Status;->WAITING:Lnet/toddm/comm/Work$Status;

    .line 35
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "RUNNING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 36
    sput-object v0, Lnet/toddm/comm/Work$Status;->RUNNING:Lnet/toddm/comm/Work$Status;

    .line 37
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "RETRYING"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 38
    sput-object v0, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    .line 39
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "REDIRECTING"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 40
    sput-object v0, Lnet/toddm/comm/Work$Status;->REDIRECTING:Lnet/toddm/comm/Work$Status;

    .line 41
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "CANCELLED"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 42
    sput-object v0, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    .line 43
    new-instance v0, Lnet/toddm/comm/Work$Status;

    const-string v1, "COMPLETED"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lnet/toddm/comm/Work$Status;-><init>(Ljava/lang/String;I)V

    .line 44
    sput-object v0, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    const/4 v0, 0x7

    .line 30
    new-array v0, v0, [Lnet/toddm/comm/Work$Status;

    sget-object v1, Lnet/toddm/comm/Work$Status;->CREATED:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v2

    sget-object v1, Lnet/toddm/comm/Work$Status;->WAITING:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v3

    sget-object v1, Lnet/toddm/comm/Work$Status;->RUNNING:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v4

    sget-object v1, Lnet/toddm/comm/Work$Status;->RETRYING:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v5

    sget-object v1, Lnet/toddm/comm/Work$Status;->REDIRECTING:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v6

    sget-object v1, Lnet/toddm/comm/Work$Status;->CANCELLED:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v7

    sget-object v1, Lnet/toddm/comm/Work$Status;->COMPLETED:Lnet/toddm/comm/Work$Status;

    aput-object v1, v0, v8

    sput-object v0, Lnet/toddm/comm/Work$Status;->ENUM$VALUES:[Lnet/toddm/comm/Work$Status;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/toddm/comm/Work$Status;
    .locals 1

    .line 1
    const-class v0, Lnet/toddm/comm/Work$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/toddm/comm/Work$Status;

    return-object p0
.end method

.method public static values()[Lnet/toddm/comm/Work$Status;
    .locals 4

    .line 1
    sget-object v0, Lnet/toddm/comm/Work$Status;->ENUM$VALUES:[Lnet/toddm/comm/Work$Status;

    array-length v1, v0

    new-array v2, v1, [Lnet/toddm/comm/Work$Status;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
