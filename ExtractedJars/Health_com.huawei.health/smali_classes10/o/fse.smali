.class public final Lo/fse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fse$a;,
        Lo/fse$b;
    }
.end annotation


# instance fields
.field private final a:Lo/fse$b;

.field private final e:Lo/fse$a;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    invoke-static {p2}, Lo/fse$a;->c(I)Lo/fse$a;

    move-result-object v0

    iput-object v0, p0, Lo/fse;->e:Lo/fse$a;

    .line 143
    invoke-static {p1}, Lo/fse$b;->d(I)Lo/fse$b;

    move-result-object v0

    iput-object v0, p0, Lo/fse;->a:Lo/fse$b;

    .line 144
    return-void
.end method

.method public constructor <init>(Lo/fse$b;Lo/fse$a;)V
    .locals 0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p2, p0, Lo/fse;->e:Lo/fse$a;

    .line 130
    iput-object p1, p0, Lo/fse;->a:Lo/fse$b;

    .line 131
    return-void
.end method


# virtual methods
.method public a()Lo/fse$b;
    .locals 1

    .line 163
    iget-object v0, p0, Lo/fse;->a:Lo/fse$b;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fse;->a:Lo/fse$b;

    invoke-virtual {v1}, Lo/fse$b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "with"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fse;->e:Lo/fse$a;

    invoke-virtual {v1}, Lo/fse$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lo/fse$a;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/fse;->e:Lo/fse$a;

    return-object v0
.end method
