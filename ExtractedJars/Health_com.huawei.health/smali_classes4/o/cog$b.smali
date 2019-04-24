.class Lo/cog$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final b:Lo/cog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 69
    new-instance v0, Lo/cog;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cog;-><init>(Lo/cog$4;)V

    sput-object v0, Lo/cog$b;->b:Lo/cog;

    .line 70
    return-void
.end method
