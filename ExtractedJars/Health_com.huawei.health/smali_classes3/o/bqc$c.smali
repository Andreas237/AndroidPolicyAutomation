.class public final Lo/bqc$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bqc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lo/bpv;

.field private final e:Lo/bqh;


# direct methods
.method private constructor <init>(Lo/bpv;Lo/bqh;)V
    .locals 0

    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 331
    iput-object p1, p0, Lo/bqc$c;->a:Lo/bpv;

    .line 332
    iput-object p2, p0, Lo/bqc$c;->e:Lo/bqh;

    .line 333
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lo/bqc$c;
    .locals 2

    .line 305
    const/4 v0, 0x0

    invoke-static {v0, p1}, Lo/bqh;->a(Ljava/lang/String;Ljava/lang/String;)Lo/bqh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lo/bqc$c;->b(Ljava/lang/String;Ljava/lang/String;Lo/bqh;)Lo/bqc$c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/bqc$c;)Lo/bqh;
    .locals 1

    .line 279
    iget-object v0, p0, Lo/bqc$c;->e:Lo/bqh;

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Lo/bqh;)Lo/bqc$c;
    .locals 4

    .line 310
    if-nez p0, :cond_0

    .line 312
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "name == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 314
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "form-data; name="

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 315
    invoke-static {v3, p0}, Lo/bqc;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    if-eqz p1, :cond_1

    .line 319
    const-string v0, "; filename="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    invoke-static {v3, p1}, Lo/bqc;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "Content-Disposition"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bpv;->a([Ljava/lang/String;)Lo/bpv;

    move-result-object v0

    invoke-static {v0, p2}, Lo/bqc$c;->e(Lo/bpv;Lo/bqh;)Lo/bqc$c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/bqc$c;)Lo/bpv;
    .locals 1

    .line 279
    iget-object v0, p0, Lo/bqc$c;->a:Lo/bpv;

    return-object v0
.end method

.method public static e(Lo/bpv;Lo/bqh;)Lo/bqc$c;
    .locals 2

    .line 288
    if-nez p1, :cond_0

    .line 290
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "body == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 292
    :cond_0
    if-eqz p0, :cond_1

    const-string v0, "Content-Type"

    invoke-virtual {p0, v0}, Lo/bpv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 294
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected header: Content-Type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 296
    :cond_1
    if-eqz p0, :cond_2

    const-string v0, "Content-Length"

    invoke-virtual {p0, v0}, Lo/bpv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 298
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected header: Content-Length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 300
    :cond_2
    new-instance v0, Lo/bqc$c;

    invoke-direct {v0, p0, p1}, Lo/bqc$c;-><init>(Lo/bpv;Lo/bqh;)V

    return-object v0
.end method
