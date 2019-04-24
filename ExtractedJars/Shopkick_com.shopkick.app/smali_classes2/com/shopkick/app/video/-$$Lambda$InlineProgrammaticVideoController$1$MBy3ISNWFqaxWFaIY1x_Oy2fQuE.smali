.class public final synthetic Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;

.field private final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;->f$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;

    iput p2, p0, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;->f$1:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;->f$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;

    iget v1, p0, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;->f$1:I

    invoke-static {v0, v1}, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->lambda$onAnimationsFinished$57(Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;I)V

    return-void
.end method
