.class public Lo/bth;
.super Lo/bte;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lo/bte;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 4

    .line 15
    const-string v0, "FitWorkoutAllListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTableName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "fit_workout_all_list"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    const-string v0, "fit_workout_all_list"

    return-object v0
.end method
