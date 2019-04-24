.class Lo/cgc$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cbu$e;
.implements Lo/cck;
.implements Lo/ccn;
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private c:Lo/abd;

.field final synthetic e:Lo/cgc;


# direct methods
.method public constructor <init>(Lo/cgc;Lo/abd;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    iput-object p2, p0, Lo/cgc$a;->c:Lo/abd;

    .line 178
    return-void
.end method

.method static synthetic c(Lo/cgc$a;)Lo/abd;
    .locals 1

    .line 172
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 253
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgc;->d(Lo/cgc;I)I

    .line 254
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->b(Lo/cgc;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cgb;->d(I)V

    .line 255
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalToRemoteProxy onStartSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    :try_start_0
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v1

    invoke-virtual {v1}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/abd;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    :cond_0
    goto :goto_0

    .line 260
    :catch_0
    move-exception v4

    .line 261
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartSport()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    :goto_0
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 243
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    invoke-interface {v0}, Lo/abd;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0

    .line 246
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(I)V
    .locals 5

    .line 184
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cgb;->b(I)V

    .line 186
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    if-eqz v0, :cond_1

    .line 188
    :try_start_0
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v1

    invoke-virtual {v1}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/abd;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    :cond_0
    goto :goto_0

    .line 191
    :catch_0
    move-exception v4

    .line 192
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGpsStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :cond_1
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 220
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 5

    .line 228
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cgb;->c(Landroid/os/Bundle;)V

    .line 230
    :try_start_0
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v4

    .line 231
    if-eqz v4, :cond_0

    .line 232
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    invoke-interface {v0, v4}, Lo/abd;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    :cond_0
    goto :goto_0

    .line 234
    :catch_0
    move-exception v4

    .line 235
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSportViewFragment()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 210
    return-void
.end method

.method public f()V
    .locals 5

    .line 298
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/cgc;->d(Lo/cgc;I)I

    .line 299
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->b(Lo/cgc;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cgb;->d(I)V

    .line 300
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalToRemoteProxy onStopSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :try_start_0
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v1

    invoke-virtual {v1}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/abd;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    :cond_0
    goto :goto_0

    .line 306
    :catch_0
    move-exception v4

    .line 307
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStopSport()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :goto_0
    return-void
.end method

.method public h()V
    .locals 5

    .line 267
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cgc;->d(Lo/cgc;I)I

    .line 269
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->b(Lo/cgc;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cgb;->d(I)V

    .line 270
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalToRemoteProxy onPauseSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :try_start_0
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v1

    invoke-virtual {v1}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/abd;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    :cond_0
    goto :goto_0

    .line 276
    :catch_0
    move-exception v4

    .line 277
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPauseSport()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :goto_0
    return-void
.end method

.method public k()V
    .locals 5

    .line 283
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgc;->d(Lo/cgc;I)I

    .line 284
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->b(Lo/cgc;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cgb;->d(I)V

    .line 285
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalToRemoteProxy onResumeSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :try_start_0
    iget-object v0, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v0}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lo/cgc$a;->c:Lo/abd;

    iget-object v1, p0, Lo/cgc$a;->e:Lo/cgc;

    invoke-static {v1}, Lo/cgc;->d(Lo/cgc;)Lo/cgb;

    move-result-object v1

    invoke-virtual {v1}, Lo/cgb;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/abd;->a(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    :cond_0
    goto :goto_0

    .line 290
    :catch_0
    move-exception v4

    .line 291
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resumeSport()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    :goto_0
    return-void
.end method
