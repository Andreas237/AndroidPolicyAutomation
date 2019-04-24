.class public final enum Lorg/researchstack/backbone/task/Task$ViewChangeType;
.super Ljava/lang/Enum;
.source "Task.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/task/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ViewChangeType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/researchstack/backbone/task/Task$ViewChangeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/researchstack/backbone/task/Task$ViewChangeType;

.field public static final enum ActivityCreate:Lorg/researchstack/backbone/task/Task$ViewChangeType;

.field public static final enum ActivityPause:Lorg/researchstack/backbone/task/Task$ViewChangeType;

.field public static final enum ActivityResume:Lorg/researchstack/backbone/task/Task$ViewChangeType;

.field public static final enum ActivityStop:Lorg/researchstack/backbone/task/Task$ViewChangeType;

.field public static final enum StepChanged:Lorg/researchstack/backbone/task/Task$ViewChangeType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 253
    new-instance v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    const-string v1, "ActivityCreate"

    invoke-direct {v0, v1, v2}, Lorg/researchstack/backbone/task/Task$ViewChangeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityCreate:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    .line 254
    new-instance v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    const-string v1, "ActivityPause"

    invoke-direct {v0, v1, v3}, Lorg/researchstack/backbone/task/Task$ViewChangeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityPause:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    .line 255
    new-instance v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    const-string v1, "ActivityResume"

    invoke-direct {v0, v1, v4}, Lorg/researchstack/backbone/task/Task$ViewChangeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityResume:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    .line 256
    new-instance v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    const-string v1, "ActivityStop"

    invoke-direct {v0, v1, v5}, Lorg/researchstack/backbone/task/Task$ViewChangeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityStop:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    .line 257
    new-instance v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    const-string v1, "StepChanged"

    invoke-direct {v0, v1, v6}, Lorg/researchstack/backbone/task/Task$ViewChangeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->StepChanged:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    .line 252
    const/4 v0, 0x5

    new-array v0, v0, [Lorg/researchstack/backbone/task/Task$ViewChangeType;

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityCreate:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityPause:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityResume:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->ActivityStop:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    aput-object v1, v0, v5

    sget-object v1, Lorg/researchstack/backbone/task/Task$ViewChangeType;->StepChanged:Lorg/researchstack/backbone/task/Task$ViewChangeType;

    aput-object v1, v0, v6

    sput-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->$VALUES:[Lorg/researchstack/backbone/task/Task$ViewChangeType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 252
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/researchstack/backbone/task/Task$ViewChangeType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 252
    const-class v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;

    return-object v0
.end method

.method public static values()[Lorg/researchstack/backbone/task/Task$ViewChangeType;
    .locals 1

    .prologue
    .line 252
    sget-object v0, Lorg/researchstack/backbone/task/Task$ViewChangeType;->$VALUES:[Lorg/researchstack/backbone/task/Task$ViewChangeType;

    invoke-virtual {v0}, [Lorg/researchstack/backbone/task/Task$ViewChangeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/researchstack/backbone/task/Task$ViewChangeType;

    return-object v0
.end method
