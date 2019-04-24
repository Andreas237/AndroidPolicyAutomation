.class Lo/crb$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final e:Lo/crb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 67
    new-instance v0, Lo/crb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crb;-><init>(Lo/crb$1;)V

    sput-object v0, Lo/crb$b;->e:Lo/crb;

    .line 68
    return-void
.end method
