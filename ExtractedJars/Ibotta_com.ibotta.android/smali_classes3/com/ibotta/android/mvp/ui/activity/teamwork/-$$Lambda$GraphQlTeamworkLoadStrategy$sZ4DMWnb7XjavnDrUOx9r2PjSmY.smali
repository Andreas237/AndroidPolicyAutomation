.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/BinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/BiFunction<",
            "TT;TU;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/BiFunction$-CC;->$default$andThen(Ljava9/util/function/BiFunction;Ljava9/util/function/Function;)Ljava9/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    check-cast p2, Lcom/ibotta/api/model/BonusModel;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->lambda$findCurrentBonusModel$1(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/api/model/BonusModel;

    move-result-object p1

    return-object p1
.end method
