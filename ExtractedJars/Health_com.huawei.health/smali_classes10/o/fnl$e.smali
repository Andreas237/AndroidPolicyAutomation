.class public final Lo/fnl$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fod;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fnl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final d:Lo/fnl$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 173
    new-instance v0, Lo/fnl$e;

    invoke-direct {v0}, Lo/fnl$e;-><init>()V

    sput-object v0, Lo/fnl$e;->d:Lo/fnl$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lo/fnl$e;
    .locals 1

    .line 181
    sget-object v0, Lo/fnl$e;->d:Lo/fnl$e;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 227
    return-void
.end method

.method public a(Lo/fmb;Lo/fly;)V
    .locals 2

    .line 191
    invoke-static {}, Lo/fnl;->a()Lo/fty;

    move-result-object v0

    const-string v1, "No lower layer set for sending response [{}]"

    invoke-interface {v0, v1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 192
    return-void
.end method

.method public a(Lo/fmb;Lo/fma;)V
    .locals 2

    .line 201
    invoke-static {}, Lo/fnl;->a()Lo/fty;

    move-result-object v0

    const-string v1, "No upper layer set for receiving request [{}]"

    invoke-interface {v0, v1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 202
    return-void
.end method

.method public b(Lo/fod;)V
    .locals 0

    .line 217
    return-void
.end method

.method public c(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 196
    invoke-static {}, Lo/fnl;->a()Lo/fty;

    move-result-object v0

    const-string v1, "No lower layer set for sending empty message [{}]"

    invoke-interface {v0, v1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 197
    return-void
.end method

.method public c(Lo/fod;)V
    .locals 0

    .line 222
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 2

    .line 211
    invoke-static {}, Lo/fnl;->a()Lo/fty;

    move-result-object v0

    const-string v1, "No lower layer set for receiving empty message [{}]"

    invoke-interface {v0, v1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 2

    .line 206
    invoke-static {}, Lo/fnl;->a()Lo/fty;

    move-result-object v0

    const-string v1, "No lower layer set for receiving response [{}]"

    invoke-interface {v0, v1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 207
    return-void
.end method

.method public e(Lo/fmb;Lo/fma;)V
    .locals 2

    .line 186
    invoke-static {}, Lo/fnl;->a()Lo/fty;

    move-result-object v0

    const-string v1, "No lower layer set for sending request [{}]"

    invoke-interface {v0, v1, p2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    return-void
.end method
