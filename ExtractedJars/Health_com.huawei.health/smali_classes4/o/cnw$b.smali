.class Lo/cnw$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cnw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final b:Lo/cnw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 87
    new-instance v0, Lo/cnw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cnw;-><init>(Lo/cnw$2;)V

    sput-object v0, Lo/cnw$b;->b:Lo/cnw;

    .line 88
    return-void
.end method
