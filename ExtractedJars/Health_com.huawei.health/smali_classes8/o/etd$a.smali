.class Lo/etd$a;
.super Lo/cah;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/cah<Lo/etd;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/etd;)V
    .locals 1

    .line 208
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/cah;-><init>(Ljava/lang/Object;Landroid/os/Looper;)V

    .line 209
    return-void
.end method


# virtual methods
.method public b(Lo/etd;Landroid/os/Message;)V
    .locals 4

    .line 213
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 214
    return-void

    .line 216
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 219
    :pswitch_0
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRunPlanReached:true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/4 v0, 0x1

    sput-boolean v0, Lo/etd;->e:Z

    .line 221
    invoke-static {p1}, Lo/etd;->e(Lo/etd;)V

    .line 222
    goto :goto_0

    .line 225
    :pswitch_1
    const/4 v0, 0x1

    sput-boolean v0, Lo/etd;->a:Z

    .line 226
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mFitnessPlanReached:true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-static {p1}, Lo/etd;->e(Lo/etd;)V

    .line 228
    goto :goto_0

    .line 230
    :pswitch_2
    const/4 v0, 0x1

    sput-boolean v0, Lo/etd;->d:Z

    .line 231
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mActivityReached:true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-static {p1}, Lo/etd;->e(Lo/etd;)V

    .line 233
    .line 237
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic c(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 206
    move-object v0, p1

    check-cast v0, Lo/etd;

    invoke-virtual {p0, v0, p2}, Lo/etd$a;->b(Lo/etd;Landroid/os/Message;)V

    return-void
.end method
