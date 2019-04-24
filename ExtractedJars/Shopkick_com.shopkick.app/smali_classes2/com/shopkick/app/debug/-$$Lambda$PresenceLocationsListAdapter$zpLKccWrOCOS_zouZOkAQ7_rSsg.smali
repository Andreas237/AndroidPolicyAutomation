.class public final synthetic Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

.field private final synthetic f$1:Ljava/lang/String;

.field private final synthetic f$2:[I

.field private final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;Ljava/lang/String;[II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$0:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    iput-object p2, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$2:[I

    iput p4, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$3:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$0:Lcom/shopkick/app/debug/PresenceLocationsListAdapter;

    iget-object v1, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$2:[I

    iget v3, p0, Lcom/shopkick/app/debug/-$$Lambda$PresenceLocationsListAdapter$zpLKccWrOCOS_zouZOkAQ7_rSsg;->f$3:I

    invoke-static {v0, v1, v2, v3, p1}, Lcom/shopkick/app/debug/PresenceLocationsListAdapter;->lambda$getView$71(Lcom/shopkick/app/debug/PresenceLocationsListAdapter;Ljava/lang/String;[IILandroid/view/View;)V

    return-void
.end method
