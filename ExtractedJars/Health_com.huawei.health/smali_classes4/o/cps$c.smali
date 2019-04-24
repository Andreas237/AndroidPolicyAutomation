.class Lo/cps$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final e:Lo/cps;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 58
    new-instance v0, Lo/cps;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cps;-><init>(Lo/cps$5;)V

    sput-object v0, Lo/cps$c;->e:Lo/cps;

    .line 59
    return-void
.end method
