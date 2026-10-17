package io.gemseeker.icons;

import io.gemseeker.icons.radix.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Gem Seeker
 */
public class Test extends Application {

    private final double SIZE = 16;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane radixTypography = new FlowPane(
                createIcon(new FontStyleIcon(SIZE), "Font Style"),
                createIcon(new FontItalicIcon(SIZE), "Font Italic"),
                createIcon(new FontRomanIcon(SIZE), "Font Roman"),
                createIcon(new FontBoldIcon(SIZE), "Font Bold"),
                createIcon(new LetterCaseUpperCaseIcon(SIZE), "Letter Case Uppercase"),
                createIcon(new LetterCaseCapitalizeIcon(SIZE), "Letter Case Capitalize"),
                createIcon(new LetterCaseLowerCaseIcon(SIZE), "Letter Case Lowercase"),
                createIcon(new LetterCaseToggleIcon(SIZE), "Letter Case Toggle"),
                createIcon(new LetterSpacingIcon(SIZE), "Letter Spacing"),
                createIcon(new AlignBaselineIcon(SIZE), "Align Baseline"),
                createIcon(new FontSizeIcon(SIZE), "Font Size"),
                createIcon(new FontFamilyIcon(SIZE), "Font Family"),
                createIcon(new HeadingIcon(SIZE), "Heading"),
                createIcon(new TextIcon(SIZE), "Text"),
                createIcon(new TextNoneIcon(SIZE), "Text None"),
                createIcon(new LineHeightIcon(SIZE), "Line Height"),
                createIcon(new UnderlineIcon(SIZE), "Underline"),
                createIcon(new StrikethroughIcon(SIZE), "Strikethrough"),
                createIcon(new OverlineIcon(SIZE), "Overline"),
                createIcon(new PilcrowIcon(SIZE), "Pilcrow"),
                createIcon(new TextAlignLeftIcon(SIZE), "Text Align Left"),
                createIcon(new TextAlignCenterIcon(SIZE), "Text Align Center"),
                createIcon(new TextAlignRightIcon(SIZE), "Text Align Right"),
                createIcon(new TextAlignJustifyIcon(SIZE), "Text Align Justify"),
                createIcon(new TextAlignTopIcon(SIZE), "Text Align Top"),
                createIcon(new TextAlignMiddleIcon(SIZE), "Text Align Middle"),
                createIcon(new TextAlignBottomIcon(SIZE), "Text Align Bottom"),
                createIcon(new DashIcon(SIZE), "Dash", true)
        );

        FlowPane radixMusic = new FlowPane(
                createIcon(new PlayIcon(SIZE), "Play"),
                createIcon(new ResumeIcon(SIZE), "Resume"),
                createIcon(new PauseIcon(SIZE), "Pause"),
                createIcon(new StopIcon(SIZE), "Stop"),
                createIcon(new TrackPreviousIcon(SIZE), "Track Previous"),
                createIcon(new TrackNextIcon(SIZE), "Track Next"),
                createIcon(new LoopIcon(SIZE), "Loop"),
                createIcon(new ShuffleIcon(SIZE), "Shuffle"),
                createIcon(new SpeakerLoudIcon(SIZE), "Speaker Loud"),
                createIcon(new SpeakerModerateIcon(SIZE), "Speaker Moderate"),
                createIcon(new SpeakerQuiteIcon(SIZE), "Speaker Quite"),
                createIcon(new SpeakerOffIcon(SIZE), "Speaker Off")
        );

        FlowPane radixAbstract = new FlowPane(
                createIcon(new HamburgerMenuIcon(SIZE), "Hamburger Menu", true),
                createIcon(new Cross1Icon(SIZE), "Cross 1", true),
                createIcon(new DotsHorizontalIcon(SIZE), "Dots Horizontal", true),
                createIcon(new DotsVerticalIcon(SIZE), "Dots Vertical", true),
                createIcon(new PlusIcon(SIZE), "Plus", true),
                createIcon(new MinusIcon(SIZE), "Minus", true),
                createIcon(new CheckIcon(SIZE), "Check", true),
                createIcon(new Cross2Icon(SIZE), "Cross 2", true),
                createIcon(new CheckCircledIcon(SIZE), "Check Circled", true),
                createIcon(new CrossCircledIcon(SIZE), "Cross Circled", true),
                createIcon(new PlusCircledIcon(SIZE), "Plus Circled", true),
                createIcon(new MinusCircledIcon(SIZE), "Minus Circled", true),
                createIcon(new QuestionMarkIcon(SIZE), "Question Mark", true),
                createIcon(new QuestionMarkCircledIcon(SIZE), "Question Mark Circled", true),
                createIcon(new InfoCircledIcon(SIZE), "Info Circled", true),
                createIcon(new AccessibilityIcon(SIZE), "Accessibility", true),
                createIcon(new ExclamationTriangleIcon(SIZE), "Exclamation Triangle", true),
                createIcon(new Share1Icon(SIZE), "Share 1", true),
                createIcon(new Share2Icon(SIZE), "Share 2", true),
                createIcon(new ExternalLinkIcon(SIZE), "External Link", true),
                createIcon(new OpenInNewWindowIcon(SIZE), "Open In New Window", true),
                createIcon(new EnterIcon(SIZE), "Enter", true),
                createIcon(new ExitIcon(SIZE), "Exit", true),
                createIcon(new DownloadIcon(SIZE), "Download", true),
                createIcon(new UploadIcon(SIZE), "Upload", true),
                createIcon(new ResetIcon(SIZE), "Reset", true),
                createIcon(new ReloadIcon(SIZE), "Reload", true),
                createIcon(new UpdateIcon(SIZE), "Update", true),
                createIcon(new EnterFullscreenIcon(SIZE), "Enter Fullscreen", true),
                createIcon(new ExitFullscreenIcon(SIZE), "Exit Fullscreen", true),
                createIcon(new DragHandleVerticalIcon(SIZE), "Drag Handle Vertical", true),
                createIcon(new DragHandleHorizontalIcon(SIZE), "Drag Handle Horizontal", true),
                createIcon(new DragHandleDots1Icon(SIZE), "Drag Handle Dots 1", true),
                createIcon(new DragHandleDots2Icon(SIZE), "Drag Handle Dots 2", true),
                createIcon(new DotIcon(SIZE), "Dot", true),
                createIcon(new DotFilledIcon(SIZE), "Dot Filled", true),
                createIcon(new CommitIcon(SIZE), "Commit", true),
                createIcon(new SlashIcon(SIZE), "Slash", true),
                createIcon(new CircleIcon(SIZE), "Circle"),
                createIcon(new CircleBackslashIcon(SIZE), "Circle Backslash"),
                createIcon(new Half1Icon(SIZE), "Half 1"),
                createIcon(new Half2Icon(SIZE), "Half 2"),
                createIcon(new ViewVerticalIcon(SIZE), "View Vertical", true),
                createIcon(new ViewHorizontalIcon(SIZE), "View Horizontal", true),
                createIcon(new ViewGridIcon(SIZE), "View Grid", true),
                createIcon(new ViewNoneIcon(SIZE), "View None", true),
                createIcon(new SquareIcon(SIZE), "Square"),
                createIcon(new CopyIcon(SIZE), "Copy")
        );
        
        FlowPane radixArrows = new FlowPane(
                createIcon(new ArrowLeftIcon(SIZE), "Arrow Left", true),
                createIcon(new ArrowRightIcon(SIZE), "Arrow Right", true),
                createIcon(new ArrowUpIcon(SIZE), "Arrow Up", true),
                createIcon(new ArrowDownIcon(SIZE), "Arrow Down", true),
                createIcon(new ArrowTopLeftIcon(SIZE), "Arrow Top Left", true),
                createIcon(new ArrowTopRightIcon(SIZE), "Arrow Top Right", true),
                createIcon(new ArrowBottomLeftIcon(SIZE), "Arrow Bottom Left", true),
                createIcon(new ArrowBottomRightIcon(SIZE), "Arrow Bottom Right", true),
                createIcon(new ChevronDownIcon(SIZE), "Chevron Down", true),
                createIcon(new ChevronLeftIcon(SIZE), "Chevron Left", true),
                createIcon(new ChevronRightIcon(SIZE), "Chevron Right", true),
                createIcon(new ChevronUpIcon(SIZE), "Chevron Up", true),
                createIcon(new DoubleArrowDownIcon(SIZE), "Double Arrow Down", true),
                createIcon(new DoubleArrowLeftIcon(SIZE), "Double Arrow Left", true),
                createIcon(new DoubleArrowRightIcon(SIZE), "Double Arrow Right", true),
                createIcon(new DoubleArrowUpIcon(SIZE), "Double Arrow Up", true),
                createIcon(new ThickArrowLeftIcon(SIZE), "Thick Arrow Left", true),
                createIcon(new ThickArrowRightIcon(SIZE), "Thick Arrow Right", true),
                createIcon(new ThickArrowUpIcon(SIZE), "Thick Arrow Up", true),
                createIcon(new ThickArrowDownIcon(SIZE), "Thick Arrow Down", true),
                createIcon(new TriangleLeftIcon(SIZE), "Triangle Left", true),
                createIcon(new TriangleRightIcon(SIZE), "Triangle Right", true),
                createIcon(new TriangleUpIcon(SIZE), "Triangle Up", true),
                createIcon(new TriangleDownIcon(SIZE), "Triangle Down", true),
                createIcon(new CaretLeftIcon(SIZE), "Caret Left", true),
                createIcon(new CaretRightIcon(SIZE), "Caret Right", true),
                createIcon(new CaretUpIcon(SIZE), "Caret Up", true),
                createIcon(new CaretDownIcon(SIZE), "Caret Down", true),
                createIcon(new CaretSortIcon(SIZE), "Caret Sort", true),
                createIcon(new WidthIcon(SIZE), "Width", true),
                createIcon(new HeightIcon(SIZE), "Height", true),
                createIcon(new SizeIcon(SIZE), "Size", true),
                createIcon(new MoveIcon(SIZE), "Move", true),
                createIcon(new AllSidesIcon(SIZE), "All Sides", true)
        );
        
        FlowPane radixObjects = new FlowPane(
                createIcon(new MagnifyingGlassIcon(SIZE), "Magnifying Glass"),
                createIcon(new GearIcon(SIZE), "Gear"),
                createIcon(new BellIcon(SIZE), "Bell"),
                createIcon(new HomeIcon(SIZE), "Home"),
                createIcon(new LockClosedIcon(SIZE), "Lock Closed"),
                createIcon(new LockOpen1Icon(SIZE), "Lock Open 1"),
                createIcon(new LockOpen2Icon(SIZE), "Lock Open 2"),
                createIcon(new BackpackIcon(SIZE), "Backpack"),
                createIcon(new CameraIcon(SIZE), "Camera"),
                createIcon(new PaperPlaneIcon(SIZE), "Paper Plane"),
                createIcon(new RocketIcon(SIZE), "Rocket"),
                createIcon(new EnvelopeCloseIcon(SIZE), "Envelope Close"),
                createIcon(new EnvelopeOpenIcon(SIZE), "Envelope Open"),
                createIcon(new ChatBubbleIcon(SIZE), "Chat Bubble"),
                createIcon(new Link1Icon(SIZE), "Link 1", true),
                createIcon(new LinkNone1Icon(SIZE), "Link None 1", true),
                createIcon(new LinkBreak1Icon(SIZE), "Link Break 1"),
                createIcon(new Link2Icon(SIZE), "Link 2"),
                createIcon(new LinkNone2Icon(SIZE), "Link None 2"),
                createIcon(new LinkBreak2Icon(SIZE), "Link Break 2"),
                createIcon(new TrashIcon(SIZE), "Trash"),
                createIcon(new Pencil1Icon(SIZE), "Pencil 1"),
                createIcon(new Pencil2Icon(SIZE), "Pencil 2"),
                createIcon(new BookmarkIcon(SIZE), "Bookmark"),
                createIcon(new BookmarkFilledIcon(SIZE), "Bookmark Filled"),
                createIcon(new DrawingPinIcon(SIZE), "Drawing Pin"),
                createIcon(new DrawingPinFilledIcon(SIZE), "Drawing Pin Filled"),
                createIcon(new SewingPinIcon(SIZE), "Sewing Pin"),
                createIcon(new SewingPinFilledIcon(SIZE), "Sewing Pin Filled"),
                createIcon(new CubeIcon(SIZE), "Cube"),
                createIcon(new ArchiveIcon(SIZE), "Archive"),
                createIcon(new CrumpledPaperIcon(SIZE), "Crumpled Paper"),
                createIcon(new MixIcon(SIZE), "Mix"),
                createIcon(new MixerHorizontalIcon(SIZE), "Mixer Horizontal"),
                createIcon(new MixerVerticalIcon(SIZE), "Mixer Vertical"),
                createIcon(new FileIcon(SIZE), "File"),
                createIcon(new FileTextIcon(SIZE), "File Text"),
                createIcon(new FilePlusIcon(SIZE), "File Plus"),
                createIcon(new FileMinusIcon(SIZE), "File Minus"),
                createIcon(new CardStackIcon(SIZE), "Card Stack"),
                createIcon(new CardStackPlusIcon(SIZE), "Card Stack Plus"),
                createIcon(new CardStackMinusIcon(SIZE), "Card Stack Minus"),
                createIcon(new IdCardIcon(SIZE), "Id Card"),
                createIcon(new Crosshair1Icon(SIZE), "Crosshair 1"),
                createIcon(new Crosshair2Icon(SIZE), "Crosshair 2"),
                createIcon(new TargetIcon(SIZE), "Target"),
                createIcon(new DiscIcon(SIZE), "Disc"),
                createIcon(new GlobeIcon(SIZE), "Globe"),
                createIcon(new SunIcon(SIZE), "Sun"),
                createIcon(new MoonIcon(SIZE), "Moon"),
                createIcon(new ClockIcon(SIZE), "Clock"),
                createIcon(new TimerIcon(SIZE), "Timer"),
                createIcon(new CounterClockwiseClockIcon(SIZE), "Counter Clockwise Clock"),
                createIcon(new CountdownTimerIcon(SIZE), "Countdown Timer"),
                createIcon(new StopwatchIcon(SIZE), "Stopwatch"),
                createIcon(new LapTimerIcon(SIZE), "Lap Timer"),
                createIcon(new LightningBoltIcon(SIZE), "Lightning Bolt"),
                createIcon(new MagicWandIcon(SIZE), "Magic Wand"),
                createIcon(new FaceIcon(SIZE), "Face"),
                createIcon(new PersonIcon(SIZE), "Person"),
                createIcon(new EyeOpenIcon(SIZE), "Eye Open", true),
                createIcon(new EyeNoneIcon(SIZE), "Eye None", true),
                createIcon(new EyeCloseIcon(SIZE), "Eye Close"),
                createIcon(new HandIcon(SIZE), "Hand"),
                createIcon(new RuleHorizontalIcon(SIZE), "Rule Horizontal"),
                createIcon(new RuleSquareIcon(SIZE), "Rule Square"),
                createIcon(new ClipboardIcon(SIZE), "Clipboard", true),
                createIcon(new ClipboardCopyIcon(SIZE), "Clipboard Copy", true),
                createIcon(new DesktopIcon(SIZE), "Desktop"),
                createIcon(new LaptopIcon(SIZE), "Laptop"),
                createIcon(new MobileIcon(SIZE), "Mobile"),
                createIcon(new KeyboardIcon(SIZE), "Keyboard"),
                createIcon(new StarIcon(SIZE), "Star"),
                createIcon(new StarFilledIcon(SIZE), "Star Filled"),
                createIcon(new HeartIcon(SIZE), "Heart"),
                createIcon(new HeartFilledIcon(SIZE), "Heart Filled"),
                createIcon(new ScissorsIcon(SIZE), "Scissors"),
                createIcon(new HobbyKnifeIcon(SIZE), "Hobby Knife"),
                createIcon(new EraserIcon(SIZE), "Eraser"),
                createIcon(new CookieIcon(SIZE), "Cookie")
        );
        
        FlowPane radixDesign = new FlowPane(
                createIcon(new FrameIcon(SIZE), "Frame"),
                createIcon(new CropIcon(SIZE), "Crop"),
                createIcon(new LayersIcon(SIZE), "Layers"),
                createIcon(new StackIcon(SIZE), "Stack"),
                createIcon(new TokensIcon(SIZE), "Tokens"),
                createIcon(new Component1Icon(SIZE), "Component 1"),
                createIcon(new Component2Icon(SIZE), "Component 2"),
                createIcon(new SymbolIcon(SIZE), "Symbol"),
                createIcon(new ComponentInstanceIcon(SIZE), "Component Instance"),
                createIcon(new ComponentNoneIcon(SIZE), "Component None"),
                createIcon(new ComponentBooleanIcon(SIZE), "Component Boolean"),
                createIcon(new ComponentPlaceholderIcon(SIZE), "Component Placeholder"),
                createIcon(new OpacityIcon(SIZE), "Opacity"),
                createIcon(new BlendingModeIcon(SIZE), "Blending Mode"),
                createIcon(new MaskOffIcon(SIZE), "Mask Off"),
                createIcon(new MaskOnIcon(SIZE), "Mask On"),
                createIcon(new ColorWheelIcon(SIZE), "Color Wheel"),
                createIcon(new ShadowIcon(SIZE), "Shadow"),
                createIcon(new ValueIcon(SIZE), "Value"),
                createIcon(new ValueNoneIcon(SIZE), "Value None"),
                createIcon(new ZoomInIcon(SIZE), "Zoom In"),
                createIcon(new ZoomOutIcon(SIZE), "Zoom Out"),
                createIcon(new TransparencyGridIcon(SIZE), "Transparency Grid"),
                createIcon(new GroupIcon(SIZE), "Group"),
                createIcon(new DimensionsIcon(SIZE), "Dimensions"),
                createIcon(new RotateCounterClockwiseIcon(SIZE), "Rotate Counter Clockwise"),
                createIcon(new ColumnsIcon(SIZE), "Columns"),
                createIcon(new RowsIcon(SIZE), "Rows"),
                createIcon(new TransformIcon(SIZE), "Transform"),
                createIcon(new BoxModelIcon(SIZE), "Box Model"),
                createIcon(new PaddingIcon(SIZE), "Padding"),
                createIcon(new MarginIcon(SIZE), "Margin"),
                createIcon(new AngleIcon(SIZE), "Angle"),
                createIcon(new CursorArrowIcon(SIZE), "Cursor Arrow"),
                createIcon(new CursorTextIcon(SIZE), "Cursor Text"),
                createIcon(new ColumnSpacingIcon(SIZE), "Column Spacing"),
                createIcon(new RowSpacingIcon(SIZE), "Row Spacing")
        );
        
        FlowPane radixComponents = new FlowPane(
                createIcon(new BoxIcon(SIZE), "Box"),
                createIcon(new AspectRatioIcon(SIZE), "Aspect Ratio"),
                createIcon(new ContainerIcon(SIZE), "Container"),
                createIcon(new SectionIcon(SIZE), "Section", true),
                createIcon(new LayoutIcon(SIZE), "Layout"),
                createIcon(new GridIcon(SIZE), "Grid"),
                createIcon(new TableIcon(SIZE), "Table"),
                createIcon(new ImageIcon(SIZE), "Image"),
                createIcon(new SwitchIcon(SIZE), "Switch", true),
                createIcon(new CheckboxIcon(SIZE), "Checkbox", true),
                createIcon(new RadioButtonIcon(SIZE), "Radio Button", true),
                createIcon(new AvatarIcon(SIZE), "Avatar"),
                createIcon(new ButtonIcon(SIZE), "Button", true),
                createIcon(new BadgeIcon(SIZE), "Badge", true),
                createIcon(new InputIcon(SIZE), "Input"),
                createIcon(new SliderIcon(SIZE), "Slider", true),
                createIcon(new QouteIcon(SIZE), "Qoute"),
                createIcon(new CodeIcon(SIZE), "Code"),
                createIcon(new ListBulletIcon(SIZE), "List Bullet", true),
                createIcon(new DropdownMenuIcon(SIZE), "Dropdown Menu", true),
                createIcon(new VideoIcon(SIZE), "Video", true),
                createIcon(new PieChartIcon(SIZE), "Pie Chart"),
                createIcon(new CalendarIcon(SIZE), "Calendar"),
                createIcon(new DashboardIcon(SIZE), "Dashboard"),
                createIcon(new ActivityLogIcon(SIZE), "Activity Log"),
                createIcon(new BarChartIcon(SIZE), "Bar Chart"),
                createIcon(new DividerVerticalIcon(SIZE), "Divider Vertical", true),
                createIcon(new DividerHorizontalIcon(SIZE), "Divider Horizontal", true)
        );
        
        FlowPane radixBordersAndCorners = new FlowPane(
                createIcon(new BorderAllIcon(SIZE), "Border All"),
                createIcon(new BorderSplitIcon(SIZE), "Border Split"),
                createIcon(new BorderNoneIcon(SIZE), "Border None"),
                createIcon(new BorderLeftIcon(SIZE), "Border Left"),
                createIcon(new BorderRightIcon(SIZE), "Border Right"),
                createIcon(new BorderTopIcon(SIZE), "Border Top"),
                createIcon(new BorderBottomIcon(SIZE), "Border Bottom"),
                createIcon(new CornersIcon(SIZE), "Corners", true),
                createIcon(new CornerTopLeftIcon(SIZE), "Corner Top Left", true),
                createIcon(new CornerTopRightIcon(SIZE), "Corner Top Right", true),
                createIcon(new CornerBottomLeftIcon(SIZE), "Corner Bottom Left", true),
                createIcon(new CornerBottomRightIcon(SIZE), "Corner Bottom Right", true),
                createIcon(new BorderStyleIcon(SIZE), "Border Style", true),
                createIcon(new BorderSolidIcon(SIZE), "Border Solid", true),
                createIcon(new BorderDashedIcon(SIZE), "Border Dashed", true),
                createIcon(new BorderDottedIcon(SIZE), "Border Dotted", true)
        );
        
        FlowPane radixAlignment = new FlowPane(
                createIcon(new AlignTopIcon(SIZE), "Align Top", true),
                createIcon(new AlignCenterVerticallyIcon(SIZE), "Align Center Vertically", true),
                createIcon(new AlignBottomIcon(SIZE), "Align Bottom", true),
                createIcon(new StretchVerticallyIcon(SIZE), "Stretch Vertically", true),
                createIcon(new AlignLeftIcon(SIZE), "Align Left", true),
                createIcon(new AlignCenterHorizontallyIcon(SIZE), "Align Center Horizontally", true),
                createIcon(new AlignRightIcon(SIZE), "Align Right", true),
                createIcon(new StretchHorizontallyIcon(SIZE), "Stretch Horizontally", true),
                createIcon(new SpaceBetweenHorizontallyIcon(SIZE), "Space Between Horizontally", true),
                createIcon(new SpaceEvenlyHorizontallyIcon(SIZE), "Space Evenly Horizontally", true),
                createIcon(new SpaceBetweenVerticallyIcon(SIZE), "Space Between Vertically", true),
                createIcon(new SpaceEvenlyVerticallyIcon(SIZE), "Space Evenly Vertically", true),
                createIcon(new PinLeftIcon(SIZE), "Pin Left"),
                createIcon(new PinLeftIcon(SIZE), "Pin Left"),
                createIcon(new PinTopIcon(SIZE), "Pin Top"),
                createIcon(new PinBottomIcon(SIZE), "Pin Bottom")
        );

        VBox radixPane = new VBox();
        radixPane.setPadding(new Insets(16));
        radixPane.setSpacing(8);
        radixPane.getChildren().addAll(
                createTitle("Typography"),
                radixTypography,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Music"),
                radixMusic,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Abstract"),
                radixAbstract,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Arrows"),
                radixArrows,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Objects"),
                radixObjects,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Design"),
                radixDesign,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Components"),
                radixComponents,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Borders and corners"),
                radixBordersAndCorners,
                new Separator(Orientation.HORIZONTAL),
                createTitle("Alignment"),
                radixAlignment
        );

        Tab radixTab = new Tab("Radix Icons");
        radixTab.setClosable(false);

        ScrollPane radixScrollPane = new ScrollPane(radixPane);
        radixScrollPane.setFitToWidth(true);
        radixScrollPane.setFitToHeight(true);
        radixTab.setContent(radixScrollPane);

        TabPane tabPane = new TabPane(radixTab);
        primaryStage.setScene(new Scene(tabPane, 1000, 600));
        primaryStage.setTitle("jfx-icons 0.0.1");
        primaryStage.show();
    }

    private VBox createIcon(SVGIcon icon, String name) {
        return createIcon(icon, name, false);
    }

    private VBox createIcon(SVGIcon icon, String name, boolean isCentered) {
        Tooltip tooltip = new Tooltip(name);
        Tooltip.install(icon, tooltip);
        VBox box = new VBox(icon);
        box.setMinWidth(36);
        box.setAlignment(isCentered ? Pos.CENTER : Pos.BOTTOM_CENTER);
        box.setPadding(new Insets(8));
        return box;
    }

    private Label createTitle(String title) {
        Label label = new Label(title);
        label.setStyle("-fx-font-weight: bold");
        return label;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
