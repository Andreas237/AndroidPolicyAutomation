.class Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;
.super Ljava/lang/Object;
.source "PersonalizationCategoriesPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Selections"
.end annotation


# instance fields
.field private selectedIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 56
    iput-object p1, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;->this$0:Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p2, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;->selectedIds:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getSelectedIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;->selectedIds:Ljava/util/Set;

    return-object v0
.end method

.method public setSelectedIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 65
    iput-object p1, p0, Lcom/ibotta/api/call/personalization/PersonalizationCategoriesPutCall$Selections;->selectedIds:Ljava/util/Set;

    return-void
.end method
