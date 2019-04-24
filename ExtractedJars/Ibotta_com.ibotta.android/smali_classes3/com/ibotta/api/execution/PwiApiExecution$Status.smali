.class public final enum Lcom/ibotta/api/execution/PwiApiExecution$Status;
.super Ljava/lang/Enum;
.source "PwiApiExecution.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/execution/PwiApiExecution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/execution/PwiApiExecution$Status;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum AUTHORIZED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum CAPTURED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum COMPLETE:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum ORDERED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum REVERSAL_FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum REVERSED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

.field public static final enum STARTED:Lcom/ibotta/api/execution/PwiApiExecution$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 24
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "STARTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->STARTED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 25
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "AUTHORIZED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->AUTHORIZED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 26
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "ORDERED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->ORDERED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 27
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "COMPLETE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->COMPLETE:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 28
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "CAPTURED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->CAPTURED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 29
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "FAILED"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 30
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "REVERSED"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->REVERSED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    .line 31
    new-instance v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const-string v1, "REVERSAL_FAILED"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/api/execution/PwiApiExecution$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->REVERSAL_FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    const/16 v0, 0x8

    .line 23
    new-array v0, v0, [Lcom/ibotta/api/execution/PwiApiExecution$Status;

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->STARTED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->AUTHORIZED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->ORDERED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->COMPLETE:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->CAPTURED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->REVERSED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->REVERSAL_FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    aput-object v1, v0, v9

    sput-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->$VALUES:[Lcom/ibotta/api/execution/PwiApiExecution$Status;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/execution/PwiApiExecution$Status;
    .locals 1

    .line 23
    const-class v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/execution/PwiApiExecution$Status;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/execution/PwiApiExecution$Status;
    .locals 1

    .line 23
    sget-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->$VALUES:[Lcom/ibotta/api/execution/PwiApiExecution$Status;

    invoke-virtual {v0}, [Lcom/ibotta/api/execution/PwiApiExecution$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/execution/PwiApiExecution$Status;

    return-object v0
.end method
