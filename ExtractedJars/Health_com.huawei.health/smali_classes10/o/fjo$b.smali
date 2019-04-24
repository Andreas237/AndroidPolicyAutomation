.class Lo/fjo$b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fjo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/fjo;


# direct methods
.method private constructor <init>(Lo/fjo;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lo/fjo$b;->c:Lo/fjo;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fjo;Lo/fjo$4;)V
    .locals 0

    .line 155
    invoke-direct {p0, p1}, Lo/fjo$b;-><init>(Lo/fjo;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    .line 157
    iget-object v0, p0, Lo/fjo$b;->c:Lo/fjo;

    invoke-static {v0}, Lo/fjo;->d(Lo/fjo;)V

    .line 158
    iget-object v0, p0, Lo/fjo$b;->c:Lo/fjo;

    invoke-static {v0}, Lo/fjo;->c(Lo/fjo;)V

    .line 159
    iget-object v0, p0, Lo/fjo$b;->c:Lo/fjo;

    invoke-static {v0}, Lo/fjo;->i(Lo/fjo;)V

    .line 160
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 155
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/fjo$b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
