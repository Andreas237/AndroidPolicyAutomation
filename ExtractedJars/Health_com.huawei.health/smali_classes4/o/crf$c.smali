.class Lo/crf$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final e:Lo/crf;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 87
    new-instance v0, Lo/crf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crf;-><init>(Lo/crf$4;)V

    sput-object v0, Lo/crf$c;->e:Lo/crf;

    .line 88
    return-void
.end method
