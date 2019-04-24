.class Lo/ezi$d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezi$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:Lo/ehe$a;

.field e:Lo/eii;


# direct methods
.method public constructor <init>(Lo/eii;Lo/ehe$a;)V
    .locals 1

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 338
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezi$d$c;->e:Lo/eii;

    .line 339
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezi$d$c;->a:Lo/ehe$a;

    .line 342
    iput-object p1, p0, Lo/ezi$d$c;->e:Lo/eii;

    .line 343
    iput-object p2, p0, Lo/ezi$d$c;->a:Lo/ehe$a;

    .line 344
    return-void
.end method
