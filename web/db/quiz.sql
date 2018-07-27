/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kili
 * Created: 27 Jul, 2018
 */
--
-- Database: `quiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `quizanswer`
--

CREATE TABLE `quizanswer` (
  `first` varchar(30) COLLATE utf8_bin NOT NULL,
  `second` varchar(30) COLLATE utf8_bin NOT NULL,
  `third` varchar(30) COLLATE utf8_bin NOT NULL,
  `fourth` varchar(30) COLLATE utf8_bin NOT NULL,
  `fifth` varchar(30) COLLATE utf8_bin NOT NULL,
  `sixth` varchar(30) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `quizanswer`
--

INSERT INTO `quizanswer` (`first`, `second`, `third`, `fourth`, `fifth`, `sixth`) VALUES
('green', 'wsport', 'president', 'steve', 'mantle', 'oneseven');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

