.class Lo/aif$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aif;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aif;


# direct methods
.method constructor <init>(Lo/aif;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lo/aif$1;->c:Lo/aif;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 166
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 167
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 170
    :pswitch_0
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 171
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    sget-object v0, Landroid/util/Patterns;->IP_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baseurl  is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 174
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 178
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x835

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_1
    :goto_0
    goto :goto_1

    .line 181
    :catch_0
    move-exception v4

    .line 182
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :goto_1
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-virtual {v0}, Lo/aif;->c()V

    .line 185
    goto/16 :goto_3

    .line 188
    :pswitch_1
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u505c\u6b62\u53d1\u5305"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 190
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x8a2

    invoke-interface {v0, v1}, Lo/ajm;->onStatus(I)V

    .line 192
    :cond_2
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-virtual {v0}, Lo/aif;->e()V

    .line 193
    goto/16 :goto_3

    .line 195
    :pswitch_2
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 196
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x83c

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    .line 198
    :cond_3
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-virtual {v0}, Lo/aif;->c()V

    .line 199
    goto/16 :goto_3

    .line 201
    :pswitch_3
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 202
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->b(Lo/aif;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x835

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    .line 204
    :cond_4
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-virtual {v0}, Lo/aif;->c()V

    .line 205
    goto :goto_3

    .line 207
    :pswitch_4
    const-string v0, "ProbeRequestTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SDK_INT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_5

    .line 209
    const/4 v4, 0x0

    :goto_2
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->c(Lo/aif;)[I

    move-result-object v0

    array-length v0, v0

    if-ge v4, v0, :cond_5

    .line 210
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->g(Lo/aif;)Landroid/net/wifi/WifiManager;

    move-result-object v0

    iget-object v1, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v1}, Lo/aif;->c(Lo/aif;)[I

    move-result-object v1

    aget v1, v1, v4

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    .line 209
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 214
    :cond_5
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->g(Lo/aif;)Landroid/net/wifi/WifiManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 215
    iget-object v0, p0, Lo/aif$1;->c:Lo/aif;

    invoke-static {v0}, Lo/aif;->d(Lo/aif;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 216
    .line 222
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method
